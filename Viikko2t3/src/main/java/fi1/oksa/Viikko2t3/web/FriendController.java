package fi1.oksa.Viikko2t3.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendController {
	
	ArrayList<String> friends2 = new ArrayList<>();
	
	@RequestMapping("index2")
	
	public String newFriend2(@RequestParam(name = "name", required = false) String friend, Model model) {
	
	if (friend != null && friend.length() >= 3 ) {
		friends2.add(friend);
	}
	
	model.addAttribute("friends", friends2);
	return "friendInfo";
}
}
