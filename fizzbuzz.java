// fizzBuzz 1
for (int i = 0; i <= max ; i++) {
  boolean fizz = (i % 3) == 0;
  boolean buzz = (i % 5) == 0;
  boolean fizzbuzz = fizz && buzz;

  if (fizzbuzz) {
    System.out.println("fizzbuzz");
  } else if (fizz) {
    System.out.println("fizz");
  } else if (buzz) {
    System.out.println("buzz");
  } else {
    System.out.println(i);
  }
}

// fizzBuzz 2
for (int i = 0; i <= 100 ; ++i) {
  boolean fizz = (i % 3);
  boolean buzz = (i % 5);
  boolean fizzbuzz = fizz && buzz;

  String output = "";

  if (fizz  == 0) {
    output = "fizz";
  }

  if (buzz == 0) {
    output += "buzz";
  } else {
    output = Integer.toString(i);
  }

  System.out.println(output);
}
