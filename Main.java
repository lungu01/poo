public class Main {

    public static void main(String[] args) {
        String str = "Machine learning (ML) is the study of computer algorithms that can improve automatically through experience and by the use of data. It is seen as a part of artificial intelligence. Machine learning algorithms build a model based on sample data, known as \"training data\", in order to make predictions or decisions without being explicitly programmed to do so. Machine learning algorithms are used in a wide variety of applications, such as in medicine, email filtering, speech recognition, and computer vision, where it is difficult or unfeasible to develop conventional algorithms to perform the needed tasks.";

        System.out.println("Num. Sentences: " + com.company.Manipulator_Info.numSentences(str));
        System.out.println("Num. Words: " + com.company.Manipulator_Info.numWords(str));
        System.out.println("Num. Letters: " + com.company.Manipulator_Info.numLetters(str));
        System.out.println("Num. Vowels: " + com.company.Manipulator_Info.numVowels(str));
        System.out.println("Num. Consonants: " + com.company.Manipulator_Info.numConsonants(str));
        com.company.Manipulator_Info.topFiveWords(str);
    }
}