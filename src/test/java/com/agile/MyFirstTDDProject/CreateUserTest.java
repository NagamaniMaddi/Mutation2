
public class CreateUserTest{

    @Test

    public void getSuccessMessageOnUserCreation(){

      //  input:username , password
      //output: Message

        //Arrange
        CreateUser createUser = new CreateUser();

        //Act

        String result = createUser.getUserCreated("Ram","password");

        //Assert

        assertEquals("User Created Successfully",result);
    }

}