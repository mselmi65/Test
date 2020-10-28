package com.company.test.web.screens.test2;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Test2;

@UiController("test_Test2.browse")
@UiDescriptor("test2-browse.xml")
@LookupComponent("test2sTable")
@LoadDataBeforeShow
public class Test2Browse extends StandardLookup<Test2> {
}