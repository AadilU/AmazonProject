package Control;

import java.util.ArrayList;

import Model.Outerwear;
import Model.Pants;
import Model.Shirts;
import View.SearchUI;

public class SearchQuery {
	private String input;
	public SearchQuery(String input) {
		this.input = input;
		search();
	}
	private void search() {
		Shirts shirtList = new Shirts();
		Pants pantList = new Pants();
		Outerwear outerwearList = new Outerwear();
		ArrayList matchedResults = new ArrayList();
		
		for(int x = 0; x < shirtList.ShirtsList.size(); x++) {
			String matchedString = shirtList.ShirtsList.get(x).getName();
			if(checkWord(input, matchedString)) {
				matchedResults.add(matchedString);
			}
		}
		for(int x = 0; x < pantList.PantsList.size(); x++) {
			String matchedString = pantList.PantsList.get(x).getName();
			if(checkWord(input, matchedString)) {
				matchedResults.add(matchedString);
			}
		}
		for(int x = 0; x < outerwearList.OuterwearList.size(); x++) {
			String matchedString = outerwearList.OuterwearList.get(x).getName();
			if(checkWord(input, matchedString)) {
				matchedResults.add(matchedString);
			}
		}
		createFrame(matchedResults);
	}
	private void createFrame(ArrayList results) {
		SearchUI frame = new SearchUI(results);
		frame.setVisible(true);
	}
	private boolean checkWord(String userInput, String matchedResult) {
		userInput = userInput.toLowerCase();
		matchedResult = matchedResult.toLowerCase();
		if(matchedResult.contains(userInput)||userInput.contains(matchedResult)) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
