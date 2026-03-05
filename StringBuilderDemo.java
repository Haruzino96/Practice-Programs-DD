public class StringBuilderDemo {
    public static void main(String giann[]) {

        String a = "Java";
        String b = new String("Java");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        //Length and Emptiness
        String g = "BulSU";
        System.out.println(g.length());
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());

        //Accessing Characters
        g = "Gian Carlo";
        System.out.println(g.charAt(0));
        System.out.println(g.charAt(5));

        char[] letters = "GIAN".toCharArray();
        System.out.println(letters[2]);

        //Extracting Parts
        g = "CyberSecurity";
        System.out.println(g.substring(3, 7));

        //Searching and checking content
        g = "Bulacan State University";
        System.out.println(g.contains("State"));

        g = "Banana";
        System.out.println(g.indexOf("na"));
        System.out.println(g.lastIndexOf("na"));
        System.out.println(g.indexOf("apple"));

        g = "report.pdf";
        System.out.println(g.startsWith("rep"));
        System.out.println(g.endsWith(".pdf"));

        //Combining Strings
        String o = "CICT";
        String p = o.concat(" - BSIT");
        System.out.println(p);

        String msg = "Hello, " + "World!";
        System.out.println(msg);

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 3; i++) sb.append(i).append(" ");
        System.out.println(sb.toString());

        //Replacing Text
        System.out.println("Information Technology".replace('o', 'a'));
        System.out.println("2026-02-18".replace("-", "/"));

        String s = "Admin123";
        System.out.println(s.replaceAll("\\d", "*"));
        System.out.println(s.replaceFirst("\\d", "*"));

        //Case Conversion
        g = "GIAN CARLO ANDRES";
        System.out.println(g.toUpperCase());
        System.out.println(g.toLowerCase());

        //Trimming Space
        //strip() / stripLeading() / stripTrailing()
        System.out.println(" Hellooo ".stripTrailing());

        //Splitting and Joining
        String csv = "IT,CS,IS,DS";
        String[] parts = csv.split(",");
        System.out.println(parts[2]);

        String domain = "unp.edu.ph";
        String[] h = domain.split("\\.");
        System.out.println(h[0]);

        String joined = String.join(" | ", "BSIT", "BSCS", "BSIS");
        System.out.println(joined);
    }
}