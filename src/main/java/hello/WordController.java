package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @Autowired
    private WordService wordService;

    @RequestMapping(value = "/words/{word}", method = RequestMethod.GET)
    public ResponseWord getWordCheck(@PathVariable String word) {

        ResponseWord responseWord = new ResponseWord();
        responseWord.setWord(word);

        boolean wordCheck = wordService.getWordCheck(word);

        if (wordCheck) {
            responseWord.setPalindrome(true);
            responseWord.setAnagramOfPalindrome(false);
        } else {
            responseWord.setPalindrome(false);
            responseWord.setAnagramOfPalindrome(true);
        }

        return responseWord;



    }

}
