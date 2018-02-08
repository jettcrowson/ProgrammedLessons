class PhoneEntry
{
  private String lastName;    // name of a person
  private String firstName;
  private String name;
  private String phone;   // their phone number

  public PhoneEntry( String n, String p )
  {
    String[] names = n.split(" ");
    name = n; firstName = names[0]; lastName = names[1]; phone = p;
  }
  
  public String getName()  {return name;}
  public String getLastName() {return lastName;}
  public String getFirstName() {return firstName;}
  public String getPhone() {return phone;}

}