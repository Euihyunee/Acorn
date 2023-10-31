package Basic;

public class Student {

    public Student() {
        Team team = new Team("개발팀", "develop");
        System.out.println(team.getCode());
    }

    public static class Team{
        private String name;
        private String code;

        public Team(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

}
