package com.company.test.web.screens.test;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Test;

@UiController("test_Test.edit")
@UiDescriptor("test-edit.xml")
@EditedEntityContainer("testDc")
@LoadDataBeforeShow
public class TestEdit extends StandardEditor<Test> {
}