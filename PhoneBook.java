class PhoneBook
{ 
  private PhoneEntry[] phoneBook; 

  public PhoneBook()    // constructor
  {
    phoneBook = new PhoneEntry[ 12 ] ;

    phoneBook[0] = new PhoneEntry( "James Barclay", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry( "Grace Dunbar", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry( "Paul Kratides", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry( "Violet Smith", "(312) 634-1937" );
    phoneBook[4] = new PhoneEntry( "John Smith", "(312) 764-1937" );

    phoneBook[6] = new PhoneEntry( "Tester Smith", "(312) 223-8765" );
    phoneBook[7] = new PhoneEntry( "Jack Smith", "(312) 223-1937" );
    phoneBook[8] = new PhoneEntry( "Caleb Smith", "(312) 223-1937" );
    phoneBook[9] = new PhoneEntry( "Fiona Smith", "(312) 223-1937" );
    phoneBook[10] = new PhoneEntry( "Chang Smith", "(312) 223-1937" );
    phoneBook[11] = new PhoneEntry( "John Wood", "(913) 883-2874" );

  }

  public String delete(String name){
      for(int i = 0; i < phoneBook.length; i++){
          if(phoneBook[i] != null && phoneBook[i].getName().toUpperCase().equals(name.toUpperCase())){
              phoneBook[i] = null;
              return "Successfully deleted " + name + ".";
          }
      }
      return "Entry not found in the phone book.";
  }

  public String add(String name, String num){
    for(int i = 0; i < phoneBook.length; i++){
        if(phoneBook[i] == null){
            phoneBook[i] = new PhoneEntry(name, num);
            return name + " added successfully";
        }
    }
    return "There were no open slots in the phone book to add the new entry";
  }

  public PhoneEntry[] search( String targetName )  
  {
    PhoneEntry[] matches;
    int howMany = 0;
    if (targetName.split(" ").length == 1 ){
        for(int i = 0; i < phoneBook.length; i++){
            if(phoneBook[i] != null && phoneBook[i].getLastName().toUpperCase().equals(targetName)){
                howMany += 1;
            }
        }
        matches = new PhoneEntry[howMany];
        int index = 0;
        for(int i = 0; i < phoneBook.length; i++){
            if(phoneBook[i] != null && phoneBook[i].getLastName().toUpperCase().equals(targetName)){
                matches[index] = phoneBook[i];
                index++;
            }
        }
        return matches;
    }else{
        for(int i = 0; i < phoneBook.length; i++){
            if(phoneBook[i] != null && phoneBook[i].getName().toUpperCase().equals(targetName)){
                return new PhoneEntry[]{phoneBook[i]};
            }
        }
    }
    return null;
  }
}