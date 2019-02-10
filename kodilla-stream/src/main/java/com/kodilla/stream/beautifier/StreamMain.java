package com.kodilla.stream.beautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier test1 = new PoemBeautifier();

        test1.beautify("testString", textToDecorate -> textToDecorate + "abc");
        test1.beautify("testStringNo2", textToDecorate -> "abc" + textToDecorate);
        test1.beautify("testStringNo3", textToDecorate -> textToDecorate.toUpperCase());
        test1.beautify("stringToTest", textToDecorate -> textToDecorate.replace("str", "new"));
        test1.beautify("testesttest", textToDecorate -> textToDecorate.concat("razdwatrzy"));
    }
}
