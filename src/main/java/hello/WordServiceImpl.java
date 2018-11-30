package hello;

import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class WordServiceImpl implements WordService {

    @Override
    public boolean getWordCheck(String word) {

        String palindromeWord = word.replaceAll("\\s+", "").toLowerCase();

        return IntStream.range(0, palindromeWord.length() / 2)
                .noneMatch(c -> palindromeWord.charAt(c) != palindromeWord.charAt(palindromeWord.length() - c - 1));

    }
}
