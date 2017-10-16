package amit.sap.bookread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class readCOntroller {

	@Autowired
	private BookService bookService;

	@RequestMapping("/read")
	public String toRead() {
		System.out.println("inside to read");
		return bookService.readingList();
	}

}
