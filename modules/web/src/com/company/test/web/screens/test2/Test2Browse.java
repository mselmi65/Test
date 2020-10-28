package com.company.test.web.screens.test2;

import com.haulmont.cuba.gui.actions.list.CreateAction;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Test2;

import javax.inject.Named;

@UiController("test_Test2.browse")
@UiDescriptor("test2-browse.xml")
@LookupComponent("test2sTable")
@LoadDataBeforeShow
public class Test2Browse extends StandardLookup<Test2> {
    @Named("test2sTable.create")
    private CreateAction<Test2> test2sTableCreate;
    @Named("test2sTable.edit")
    private EditAction<Test2> test2sTableEdit;

    @Subscribe
    public void onInit(InitEvent event) {
        test2sTableEdit.setScreenClass(Test2Edit.class);
        test2sTableCreate.setScreenClass(Test2Edit.class);
    }
}