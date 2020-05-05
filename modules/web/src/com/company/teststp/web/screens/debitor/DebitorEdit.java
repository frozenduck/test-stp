package com.company.teststp.web.screens.debitor;

import com.haulmont.cuba.gui.screen.*;
import com.company.teststp.entity.Debitor;

@UiController("teststp_Debitor.edit")
@UiDescriptor("debitor-edit.xml")
@EditedEntityContainer("debitorDc")
@LoadDataBeforeShow
public class DebitorEdit extends StandardEditor<Debitor> {
}