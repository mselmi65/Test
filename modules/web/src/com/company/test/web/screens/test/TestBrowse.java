package com.company.test.web.screens.test;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Test;

@UiController("test_Test.browse")
@UiDescriptor("test-browse.xml")
@LookupComponent("testsTable")
@LoadDataBeforeShow
public class TestBrowse extends StandardLookup<Test> {
}