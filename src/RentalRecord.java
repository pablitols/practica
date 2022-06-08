//Clase RentalRecord que es hija de FechaHora
public class RentalRecord extends FechaHora{
    //Elementos
	private String RentId;
    private FechaHora RentDate;
    private FechaHora EstimatedReturnDate;
    private FechaHora ActualReturnDate;
    private Double RentalFee;
    private Double LateFee;

    //Constructor
    RentalRecord(String RentId,FechaHora Rentdate,FechaHora EstimatedReturnDate)
    {
        this.RentId=RentId;
        this.RentDate=Rentdate;
        this.EstimatedReturnDate=EstimatedReturnDate;
    }
    
    //Setters and getters
    public void setData(FechaHora ActualDate,Double RentalFee,Double LateFee)
    {
        this.ActualReturnDate=ActualDate;
        this.RentalFee=RentalFee;
        this.LateFee=LateFee;
    }
    public FechaHora getEstimatedReturnDate() {
        return this.EstimatedReturnDate;
    }

    public FechaHora getRentDate()
    {
        return this.RentDate;
    }

    //Metodo toString
    public String toString()
    {
        if(this.ActualReturnDate==null && this.RentalFee==null && this.LateFee==null){
            String data = this.RentId+":"+this.RentDate.toString()+":"+this.EstimatedReturnDate.toString()+":none:none:none";
            return data;
        }
        else{
           return this.RentId+":"+this.RentDate.toString()+":"+this.EstimatedReturnDate.toString()+":"+this.ActualReturnDate.toString()+":"+this.RentalFee.toString()+":"+this.LateFee.toString();
        }
    }

    //Metodo de RentalRecord para mostrar los datos
    public String getDetails()
    {
        if(this.ActualReturnDate==null && this.RentalFee==null && this.LateFee==null) {
            String data =
                        "Record ID:             " + this.RentId
                    + "\nRent Date:             " + this.RentDate.toString()
                    + "\nEstimated Return Date: " + this.EstimatedReturnDate.toString();

            return data;
        }
        else{
            return      "Record ID:             " + this.RentId
                    + "\nRent Date:             " + this.RentDate.toString()
                    + "\nEstimated Return Date: " + this.EstimatedReturnDate.toString()
                    + "\nActual Return Date:    "+this.ActualReturnDate.toString()
                    + "\nRental Fee:            "+String.format ("%.2f", this.RentalFee)+
                      "\nLate Fee:              "+String.format("%.2f",this.LateFee);
        }
    }
	
	
}