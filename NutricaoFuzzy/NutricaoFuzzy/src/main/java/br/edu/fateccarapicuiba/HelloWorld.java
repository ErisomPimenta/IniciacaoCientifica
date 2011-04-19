package br.edu.fateccarapicuiba;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public @Model class HelloWorld
{
   private final String text = "Hello World!";

   private String letters;
   
   private String numbers;
   
   private String numbers1;
   private String numbers2;
   private String numbers3;
   
   public String getNumbers1() {
	   
	return numbers1;
}

public void setNumbers1(String numbers1) {
	this.numbers1 = numbers1;
}

public String getNumbers2() {
	return numbers2;
}

public void setNumbers2(String numbers2) {
	this.numbers2 = numbers2;
}

public String getNumbers3() {
	return numbers3;
}

public void setNumbers3(String numbers3) {
	this.numbers3 = numbers3;
}

private String email;
   
   public HelloWorld() {}

   @PostConstruct
   public void initialize()
   {
      System.out.println(this.getClass().getSimpleName() + " was constructed");
   }

   public String getText()
   {
      return text;
   }

   @NotNull
   @NotEmpty
   @Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
   public String getLetters()
   {
      return letters;
   }

   public void setLetters(String letters)
   {
      this.letters = letters;
   }

   @NotNull
   @NotEmpty
   @Digits(fraction = 0, integer = 2)
   public String getNumbers()
   {
      return numbers;
   }

   public void setNumbers(String numbers)
   {
      this.numbers = numbers;
   }

   @NotNull
   @NotEmpty
   @Email
   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

}
