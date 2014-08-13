public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester){
// It checks whether each Person instance contained in the list parameter satisfies the criteria specified by tester.
for(Person p: roster)
{
if(tester.test(p))
{
p.printPerson();
}
}


}
