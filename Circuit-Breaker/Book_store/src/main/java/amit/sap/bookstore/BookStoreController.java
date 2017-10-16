package amit.sap.bookstore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreController {

	@RequestMapping(value = "/recommended")
	public String readingList() {
		return "Spring in Action ";
	}

}
