package uta.cse.cse3310.JSBSimEdit.utils;

public class Constants {
    
    // app settings
    public static final String APP_NAME = "JSBSimEdit (JE)";
    public static final int APP_SIZEX = 1250;
    public static final int APP_SIZEY = 600;

    // file extensions
    public static final String EXT_PNG = ".png";
    public static final String EXT_JPG = ".jpg";

    public static final String EXT_XML = "xml";
    public static final String EXT_XML_DESC = "XML files (*.xml)";

    // colored text in terminal
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    // RESOURCES ARE NOT PATHS - ALWAYS USE "/" AS SEPARATOR
    // res folders
    public static final String ICONS_RESF = "icons/";

    // res ui icons
    // https://www.flaticon.com/search?author_id=1&style_id=153&type=standard&word=
    public static final String OPEN_RES = ICONS_RESF + "open-folder" + EXT_PNG;
    public static final String SAVE_RES = ICONS_RESF + "save-file" + EXT_PNG;
}