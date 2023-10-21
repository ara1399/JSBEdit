package uta.cse.cse3310.JSBSimEdit.interfaces;

import java.util.Optional;

import generated.FdmConfig;

// Interface for tabs with main window
public interface TabComponent {
    
    void bindUIwithXML(FdmConfig cfg);
    Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg);
}
