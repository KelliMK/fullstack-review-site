package org.wecancodeit.fullstackreviewsite;
 
import javax.annotation.Resource;
 
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.fullstackreviewsite.model.Category;
import org.wecancodeit.fullstackreviewsite.model.Review;
import org.wecancodeit.fullstackreviewsite.repositories.CategoryRepository;
import org.wecancodeit.fullstackreviewsite.repositories.ReviewRepository;
 
@Service
public class CategoryPopulator implements CommandLineRunner {
 	@Resource
	CategoryRepository categoryRepo;
	
	@Resource
	ReviewRepository reviewRepo;
 	@Override
	public void run(String... args) throws Exception {
		Category scriptingLanguages = new Category("Scripting Languages", "Programming languages that support special run-time environment programs that automate the execution of tasks. Scripting languages are interpreted by programs, not compiled.","code-1839877_640");
		Category objectOrientedLanguages = new Category("Object-Oriented Languages", "Programming languages made to be used with the object-oriented programming paradigm, focusing on creating object-class instances to be modified and interpreted.","code-2620118_640");
		Category functionalLanguages = new Category("Functional Languages", "Programming languages that are designed to handle symbolic computation and list processing applications. These languages are based on mathematical functions. Subsequently, they are also hell.","code-3637299_640");
		
		scriptingLanguages = categoryRepo.save(scriptingLanguages);
		objectOrientedLanguages = categoryRepo.save(objectOrientedLanguages);
		functionalLanguages = categoryRepo.save(functionalLanguages);
		
		Review html = new Review("HTML", 1990, "Honestly, I love HTML and CSS (even though we didn't build a review for CSS) and I feel like they are wizardry. Although that's how I feel for all programming languages in one way or another. Oh yeah, one uses html to build the structure of web pages. -Kelli", scriptingLanguages, 9L, 5L, "code-583073_640");
		Review tads = new Review("TADS", 1988, "Used to make interactive fiction games. I love it and am unabashedly biased towards it. This is the language that got me into programming. Pretty versatile for building stories, but if you want to build anything outside the TADS Virtual Machine then don't use it. -Kelli", scriptingLanguages, 10L, 4L, "code-583795_640");
		Review cPlusPlus = new Review("C++", 1983, "A great object oriented language that has many extensive libraries. Styled after C, it is often described as \"C, but with classes.\" It is a bit low-level for a single developer to use, but still useful to know. -Kelli", objectOrientedLanguages, 5L, 9L, "computer-2583383_640");
		Review java = new Review("Java", 1994, "Sucks, terrible, the worst language ever invented. I highly recommend never using it ever. James Gosling, the inventor of Java, is famously credited with saying \"Ugh, please don't bring up Java. What a headache of a language. Versatility is stupid.\" (Also this course is based on learning programming with Java so please don't fail me) -Kelli", objectOrientedLanguages, 6L, 9L, "monitor-933392_640");
		Review python = new Review("Python", 1989, "An object oriented language used by Google and other tech companies for reasons I have yet to figure out. One of the more interesting things about Python is how it approximates English pretty well. If someone who learned Python before they learned English I wonder how they would talk? -Kelli", objectOrientedLanguages, 7L, 8L, "programming-3652497_640");
		Review haskell = new Review("Haskell", 1990, "This language hurts my brain. It's math. It's just math. IT'S MATH. MAAAAAAAAATH. -Kelli", functionalLanguages, 3L, 10L, "source-code-583537_640");
		
		html = reviewRepo.save(html);
		tads = reviewRepo.save(tads);
		cPlusPlus = reviewRepo.save(cPlusPlus);
		java = reviewRepo.save(java);
		python = reviewRepo.save(python);
		haskell = reviewRepo.save(haskell);
	}
}