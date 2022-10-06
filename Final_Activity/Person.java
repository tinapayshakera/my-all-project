class Person {
 
   
   String name;
   int age;

   Person(String name, int age)
   {
      
       this.name = name;
       this.age = age;
   }
   public int getAge() {

      return age;
      
      }
      
      public String getName() {
      
      return name;
      
      }
      public void setAge(int newAge) {

         age = newAge;
         
         }
         
         public void setName(String newName) {
         
         name = newName;
         
         }
}