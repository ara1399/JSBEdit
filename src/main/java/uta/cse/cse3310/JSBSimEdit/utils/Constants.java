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
    public static final String ICONS_ORG_RESF = "icons/original/";
    public static final String PROPS_RESF = "props/";
    
    // res properties
    public static final String PROPS_RES = PROPS_RESF + "props." + EXT_XML;
    
    // res ui background
    public static final String BG_RES = ICONS_RESF + "f16-500-238" + EXT_PNG;
    
    // res ui icons 16x16
    // https://www.flaticon.com/search?author_id=1&style_id=153&type=standard&word=
    public static final String OPEN_RES = ICONS_RESF + "open-folder" + EXT_PNG;
    public static final String SAVE_RES = ICONS_RESF + "save-file" + EXT_PNG;

    // res ui original icons 32x32
    public static final String SOURCE_RES = ICONS_ORG_RESF + "source" + EXT_PNG;
    public static final String DESTINATION_RES = ICONS_ORG_RESF + "destination" + EXT_PNG;
    public static final String SUMMER_RES = ICONS_ORG_RESF + "summer" + EXT_PNG;
    public static final String PID_RES = ICONS_ORG_RESF + "pid" + EXT_PNG;
    public static final String GAIN_RES = ICONS_ORG_RESF + "gain" + EXT_PNG;
    public static final String FILTER_RES = ICONS_ORG_RESF + "filter" + EXT_PNG;
    public static final String DEADBAND_RES = ICONS_ORG_RESF + "deadband" + EXT_PNG;
    public static final String SWITCH_RES = ICONS_ORG_RESF + "switch" + EXT_PNG;
    public static final String KINEMAT_RES = ICONS_ORG_RESF + "kinemat" + EXT_PNG;
    public static final String FUNC_RES = ICONS_ORG_RESF + "func" + EXT_PNG;
    public static final String TABLE_RES = ICONS_ORG_RESF + "table_icon" + EXT_PNG;
    public static final String VALUE_RES = ICONS_ORG_RESF + "value_icon" + EXT_PNG;
    public static final String PROPERTY_RES = ICONS_ORG_RESF + "property_icon" + EXT_PNG;
    public static final String PRODUCT_RES = ICONS_ORG_RESF + "operator_product" + EXT_PNG;
    public static final String FUNCTION_RES = ICONS_ORG_RESF + "operator_func" + EXT_PNG;
    public static final String AXIS_RES = ICONS_ORG_RESF + "axis" + EXT_PNG;
    public static final String AERO_RES = ICONS_ORG_RESF + "fileheader_icon" +EXT_PNG;
}
