class ComparisonProvider{
public int compareByname(Person a, Person b){
return a.getName().compareTo(b.getName());
}
public int comparebyAge(Person a, Person b){
return a.getBirthday().compareTo(b.getBirthday());
}
ComparisonProvider myComparisonProvider = new ComparisonProvider();

Arrays.sort(rosterAsArray, myComparisonProvider::compareByname);
}
