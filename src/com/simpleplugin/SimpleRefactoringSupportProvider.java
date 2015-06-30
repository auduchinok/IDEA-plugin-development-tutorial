package com.simpleplugin;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import com.simpleplugin.psi.SimpleProperty;

public class SimpleRefactoringSupportProvider extends RefactoringSupportProvider {
    @Override

    // почему мы можем вернуть PsiElement из функции, которая должна возвращать boolean?
    public boolean isMemberInplaceRenameAvailable(PsiElement element, PsiElement context) {
        return element instanceof SimpleProperty;
    }
}