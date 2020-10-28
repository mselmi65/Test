package com.company.test.web.screens.test2;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Test2;

@UiController("test_Test2.edit")
@UiDescriptor("test2-edit.xml")
@EditedEntityContainer("test2Dc")
@LoadDataBeforeShow
public class Test2Edit extends StandardEditor<Test2> {
}