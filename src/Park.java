public class Park {
    void TalkAboutTestResults (String subject){
        System.out.print(subject +" "+ RandomPrefix() + " 망했어");
    }
    private String RandomPrefix(){
        String[] arr = {"개", "좆", "존나", "진짜", "완전"};
        int index = (int)(Math.random() * arr.length);
        return arr[index];
    }
}
