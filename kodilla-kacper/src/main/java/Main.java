public class Main {
    public static void main(String[] args){

    Team createTeam = new Team();
    createTeam.addPersonToTeam("Kacper", "Orłowski", 27, 'm');
    createTeam.addPersonToTeam("Maruisz", "Narkiewicz", 20, 'm');
    createTeam.addPersonToTeam("Krystian", "Pudzianowski", 33, 'm');
    createTeam.addPersonToTeam("Marzena", "Sułek", 20, 'f');
    createTeam.addPersonToTeam("Karolina", "Nowacka", 32, 'f');


    createTeam.personOlderThan25();
    createTeam.showOnlyWoman();
createTeam.totalAgeInTeam();
    }



}
