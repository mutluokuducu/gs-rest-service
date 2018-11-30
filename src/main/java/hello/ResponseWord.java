package hello;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ResponseWord {
    String word;
    boolean palindrome;
    boolean anagramOfPalindrome;
}
