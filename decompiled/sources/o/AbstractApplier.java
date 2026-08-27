package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractApplier {
    public abstract down read();

    public static final androidx.compose.ui.Modifier write(androidx.compose.ui.Modifier modifier, registerInAppMessageManagerlambda7 registerinappmessagemanagerlambda7, SmallIconButtonTokens smallIconButtonTokens, SelectionHandleIcon selectionHandleIcon, boolean z) {
        return modifier.then(new SwitchTokens(registerinappmessagemanagerlambda7, smallIconButtonTokens, selectionHandleIcon, z));
    }

    public Object read(int i) {
        Object objInvoke;
        TextFieldImplKtCommonDecorationBox3containerWithId1 textFieldImplKtCommonDecorationBox3containerWithId1Write = read().write(i);
        int i2 = textFieldImplKtCommonDecorationBox3containerWithId1Write.serializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmSerializer = textFieldImplKtCommonDecorationBox3containerWithId1Write.write.serializer();
        return (r8lambdaunavo3sxub_pc9xroryotnrlvsmSerializer == null || (objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsmSerializer.invoke(Integer.valueOf(i - i2))) == null) ? new androidx.compose.foundation.lazy.layout.DefaultLazyKey(i) : objInvoke;
    }
}
