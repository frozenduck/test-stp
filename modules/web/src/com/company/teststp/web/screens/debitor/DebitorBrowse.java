package com.company.teststp.web.screens.debitor;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;
import com.company.teststp.entity.Debitor;
import com.haulmont.cuba.gui.screen.LookupComponent;

import javax.inject.Inject;

@UiController("teststp_Debitor.browse")
@UiDescriptor("debitor-browse.xml")
@LookupComponent("debitorsTable")
@LoadDataBeforeShow
public class DebitorBrowse extends StandardLookup<Debitor> {

    @Inject
    protected Button runReportBtn;
}