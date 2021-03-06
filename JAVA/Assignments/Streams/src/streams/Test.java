package streams;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*; 

import streams.TestData;
public class Test {

	public static void main(String[] args) {
//		1.	Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
		List<Fruit> lowCalFruits = TestData.getAllFruits().stream()
				.filter(fruit -> fruit.getCalories() < 100 )
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.collect(Collectors.toList());

		//2.	Display color wise list of fruits.
		Map<String,List<Fruit>> colorWise = TestData.getAllFruits().stream()
				.collect(Collectors.groupingBy(Fruit::getColor));
			
//		3.	Display only RED color fruits sorted as per their price in ascending order.
		List<Fruit> onlyRed = TestData.getAllFruits().stream()
				.filter(fruit -> fruit.getColor().equals("Red"))
				.sorted(Comparator.comparing(Fruit::getPrice))
				.collect(Collectors.toList());

//		4.	Find out the newsId which has received maximum comments
		int maxIdComment = TestData.getAllNews().stream()
				.collect(Collectors.groupingBy(News::getNewsId,counting())).entrySet().stream().max(Entry.comparingByValue()).get().getKey();

//		5. Find out how many times the word 'budget' arrived in user comments of all news.
		long countBudget = TestData.getAllNews().stream()
				.filter(comment -> comment.getComment().contains("budget")).count();
		System.out.println(countBudget);
		//6.	Display commentByUser wise number of comments.
		Map<String,Long> noOfComments = TestData.getAllNews().stream()
				.collect(Collectors.groupingBy(News::getCommentByUser, counting()));
//		noOfComments.entrySet().forEach(System.out::println);
		
		//7.	Find all transactions in the year 2011 and sort them by value (small to high). 
		List<Transaction> tran = TestData.getAllTransactions().stream()
				.filter(trans -> trans.getYear() < 2016)
				.sorted(Comparator.comparing(Transaction::getYear))
				.collect(Collectors.toList());
//		tran.forEach(System.out::println);
		
		//8.	What are all the unique cities where the traders work?
		List<String> cities = TestData.getAllTransactions().stream()
				.map(Transaction::getTrader)
				.map(Trader::getCity)
				.distinct()
				.collect(Collectors.toList());
//		cities.forEach(System.out::println);
//		9.	Find all traders from Pune and sort them by name.
		List<Trader> traders = TestData.getAllTransactions().stream()
				.map(Transaction::getTrader)
//				.map(Trader::getCity)
				.filter(city -> city.getCity().equals("Pune"))
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
//		traders.forEach(System.out::println);
		
//		10.	Return a string of all traders� names sorted alphabetically.
		List<String> traderNames = TestData.getAllTransactions().stream()
				.map(Transaction::getTrader)
				.map(Trader::getName)
				.sorted()
				.collect(Collectors.toList());
//		traderNames.forEach(System.out::println);
		
		//11.	Are any traders based in Indore?
		List<Trader> tradersInIndore = TestData.getAllTransactions().stream()
				.map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equals("Indore"))
				.collect(Collectors.toList());
		//tradersInIndore.forEach(System.out::println);
		//12.	Print all transactions� values from the traders living in Delhi
		List<Integer> transValues = TestData.getAllTransactions().stream()
				.filter(trans -> trans.getTrader().getCity().equals("Delhi"))
				.map(Transaction::getValue)
				.collect(Collectors.toList());
//		transValues.forEach(System.out::println);
//		13.	What�s the highest value of all the transactions?
		Optional<Integer> maxValue = TestData.getAllTransactions().stream()
				.map(Transaction::getValue)
				.reduce(Integer::max);
//		System.out.println(maxValue);
//		14.	Find the transaction with the smallest value.
		Optional<Integer> minValue = TestData.getAllTransactions().stream()
				.map(Transaction::getValue)
				.reduce(Integer::min);
//		System.out.println(minValue);
//		15.	Find out which user has posted maximum comments.
		String userMostComments = TestData.getAllNews().stream()
				.collect(Collectors.groupingBy(News::getCommentByUser,counting())).entrySet().stream().max(Entry.comparingByValue()).get().getKey();
//		System.out.println(userMostComments);
	}

}
