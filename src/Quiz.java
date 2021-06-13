import java.util.Scanner;

public class Quiz {
    public void display_Menu(){
        System.out.println("\n\n------------------Select from the following menu which quiz you want to play--------------");
        System.out.println("\t\t\t\t\t\t1. Sports Quiz");
        System.out.println("\t\t\t\t\t\t\t2.Gk quiz");
        System.out.println("---------Choose from the following option----------------");
    }
    public static void Sports_Quiz(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("\n\n=============Lets Start the Sports Quiz====================");
        char option;
        int points = 0;
        System.out.println("Q.1] what does the olympic flame symbolize?\n[a]. Zeal to play sports\n[b]. Challenge\n[c]. Continuity \n[d]. Integrity");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Correct Answer");
            points += 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.2] India played its first one day international with which country and in which year?\n[a]. England 1975\n[b]. Australia 1976\n[c]. New Zealand 1975\n[d]. England 1978");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
            points -= 1;
        }
        else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.3] In international Cricket, the game is adjudicated by how many umpires? \n[a]. Two umpires, aided by a third umpire and a match referee \n[b]. One umpire, aided by a third umpire and a match referee \n[c]. Two umpires, aided by a match referee \n[d]. Two umpires, aided by a third umpire");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd') {
            System.out.println("Wrong Answer");
            points -= 1;
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }

        System.out.println("Q.4) Who had started the internaional Women's Boxing Hall of Fame ? \n[a].Terri Moss \n[b].Sue TL Fox \n[c].clsressa Shields \n[d].Barbara Buttrick");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'b'){
            System.out.println("Correct Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd') {
            System.out.println("Wrong Answer");
            points -= 1;
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }

        System.out.println("Q.5) Which country has won the maximum number of medals in the all time history of commonwealth games? \n[a].Australia \n[b].England \n[c].India \n[d].Canada");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd') {
            System.out.println("Wrong Answer");
            points -= 1;
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.6) Where were the commonwealth Games first held ? \n[a].Bath \n[b].Ayer \n[c].Hamilton \n[d].Manchester");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Correct Answer");
            points += 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.7) Where were the first Asian games held? \n[a].Jakarta \n[b].Kathmandu \n[c].New Delhi \n[d].Islamabad");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Correct Answer");
            points += 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.8) Which of the following nation was not a founding member of the Badminton World Federation ? \n[a].Germany \n[b].France \n[c].England \n[d].Netherlands");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd') {
            System.out.println("Wrong Answer");
            points -= 1;
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.9) Which was the first 1st non test playing country to beat India in an International match ?\n[a].canada \n[b].Sri lanka \n[c].Zimbabwe \n[d].East Africa");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'b'){
            System.out.println("Correct Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd') {
            System.out.println("Wrong Answer");
            points -= 1;
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.10) India Won its first Olympic hockey gold in..? \n[a].1928 \n[b].1932 \n[c].1936 \n[d].1948");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd') {
            System.out.println("Wrong Answer");
            points -= 1;
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Your total score is: "+points+"/10");


    }
    public static void GK_Quiz(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("\n\n=============Lets Start the GK Quiz====================");
        char option;
        int points = 0;
        System.out.println("Q.1) For which of the following disciplines is nobel prize awarded? \n[a].Physics and chemistry \n[b].physiology or medicine \n[c].Literature,Peace and Economics \n[d].All of the above");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
            points -= 1;
        }
        else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.2) Hitler party came into power in 1933 is known as ? \n[a].Labour Party \n[b].Nazi party \n[c].ku-klux party \n[d].Democratic Party");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'b'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
            points -= 1;
        }
        else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.3) FFC stands for ? \n[a].Foreign Finance Corporation \n[b].FIlm finance corporation \n[c].Federation of Football council \n[d].None of the above");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'b'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
            points -= 1;
        }
        else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.4) Galileo was an Italian astronomer who ? \n[a].developed the telescope \n[b]. discovered four satellites of jupiter \n[c].discovered that the movement of pendulum produces a regular time measurement \n[d].All of the above");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd'){
            System.out.println("Correct Answer");
            points += 1;
        }
        else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.5) First China War was fought between ? \n[a].China and Britain \n[b].China and france \n[c].China and Egypt \n[d].China and Greek");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }

        System.out.println("Q.6) Film and TV institute of India is located at ? \n[a].Pune(Maharashtra) \n[b].Rajkot(Gujarat) \n[c].Pimpri(Maharashtra) \n[d].Perambur(Tamilnadu)");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.7) Guru Gobind singh was ? \n[a].The 10th Guru of the Sikhs \n[b].Founder of khalsa,the inner council of the Sikhs in 1699 \n[c].Author of Dasam Granth \n[d].All of the above");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd'){
            System.out.println("Correct Answer");
            points += 1;
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.8) During World War 2 ,When did germany attack France? \n[a].1940 \n[b].1941 \n[c].1942 \n[d].1943");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.9) Ecology deals with ? \n[a].Birds \n[b].cell formation \n[c].relation between organisms and their environment \n[d].Tissues");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Correct Answer");
            points += 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }
        System.out.println("Q.10) For purifying drinking water alum is used ? \n[a].for coagulation of mud particles \n[b].To kill bacteria \n[c].To remove salts \n[d].To remove gases");
        option = Sc.next().charAt(0);
        if(option == 'a'){
            System.out.println("Correct Answer");
            points +=1;
        }else if(option == 'b'){
            System.out.println("Wrong Answer");
            points -=1;
        }else if(option == 'c'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else if(option == 'd'){
            System.out.println("Wrong Answer");
            points -= 1;
        }else{
            System.out.println("You have entered wrong option");
            points -= 1;
        }

        System.out.println("The total score is: "+points+"/10");

    }
    public static void main(String[] args) {
        Quiz Q = new Quiz();
        Q.display_Menu();
        Scanner Sc = new Scanner(System.in);
        int selection = Sc.nextInt();
        if(selection == 1){
            Sports_Quiz();
        }else if(selection == 2){
            GK_Quiz();
        }
    }
}