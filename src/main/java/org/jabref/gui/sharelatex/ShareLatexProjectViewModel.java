package org.jabref.gui.sharelatex;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class ShareLatexProjectViewModel {

    private final String projectId;
    private final StringProperty projectTitle;
    private final StringProperty owner;
    private final StringProperty lastUpdated;

    public ShareLatexProjectViewModel(String projectId, String projectTitle, String owner, String lastUpdated) {

        this.projectId = projectId;
        this.projectTitle = new SimpleStringProperty(projectTitle);
        this.owner = new SimpleStringProperty(owner);
        this.lastUpdated = new SimpleStringProperty(lastUpdated);

    }
}