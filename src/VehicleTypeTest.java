import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehicleTypeTest {

	//Aqui probamos que el tipo de vehiculo sea igual al valor devuelto del metodo testCanBeRentedForMinimumDays() que se encuentra en la clase VehicleType
	@Test
	void testCanBeRentedForMinimumDays() {
		VehicleType vehicle = new VehicleType(4);
		int result =  vehicle.canBeRentedForMinimumDays(new FechaHora(),"car");
		int expected = 3;
		assertEquals(expected, result);
		}

	
	//Aqui probamos que el tipo de vehiculo sea el correcto dependiendo del numOfRentDays
	@Test
	void testIsUnderMaintenance() {
		VehicleType vehicle = new VehicleType(4, new FechaHora());
		boolean result =  vehicle.IsUnderMaintenance(new FechaHora(), "car", 13);
		boolean expected = false;
		assertEquals(expected, result);
	}

}
