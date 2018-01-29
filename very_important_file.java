package top.secret.data

public class Foo {
	
	private String name;
	private String email;
	private String pass;
	private long motherInLawHateLevel;
	
	public bar() {
		Stream<Pair> allFactorials = Stream.iterate(
  new Pair(BigInteger.ONE, BigInteger.ONE),
  x -> new Pair(
    x.num.add(BigInteger.ONE),
    x.value.multiply(x.num.add(BigInteger.ONE))));
return allFactorials.filter(
  (x) -> x.num.equals(num)).findAny().get().value;
	}
}