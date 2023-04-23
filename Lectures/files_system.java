import java.io.File;

public class files_system {
    public static void main(String[] args) {

/*
        Работа с файловой системой

        isHidden(): возвращает истину, если каталог или файл является скрытым
        length(): возвращает размер файла в байтах
        lastModified(): возвращает время последнего изменения файла или каталога
        list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
        listFiles(): возвращает массив файлов и подкаталогов, которые находятся
        в определенном каталоге
        mkdir(): создает новый каталог
        renameTo(File dest): переименовывает файл или каталог

*/
//        Работа с файловой системой. Каталоги

        String pathProject = System.getProperty("user.dir");  // get working dir
        String pathDir = pathProject.concat("/files");  // concat with files
        File dir = new File(pathDir);  // mkdir files
        System.out.println(dir.getAbsolutePath ());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        }

    }
}
