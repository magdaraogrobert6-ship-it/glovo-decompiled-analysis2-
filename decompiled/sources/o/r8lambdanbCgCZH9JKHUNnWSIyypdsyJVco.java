package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdanbCgCZH9JKHUNnWSIyypdsyJVco implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final getMainActivityIntentdefault reader;
    public final /* synthetic */ createHorizontalAnimation this$0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o.createHorizontalAnimation] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.createHorizontalAnimation] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o.createFromParcel] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [o.InAppMessageSlideupView] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws Throwable {
        Throwable th;
        InAppMessageSlideupView inAppMessageSlideupView;
        ?? r0 = this.this$0;
        getMainActivityIntentdefault getmainactivityintentdefault = this.reader;
        InAppMessageSlideupView inAppMessageSlideupView2 = InAppMessageSlideupView.INTERNAL_ERROR;
        ?? r3 = 1;
        IOException e = null;
        try {
            try {
                if (!getmainactivityintentdefault.IconCompatParcelizer(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (getmainactivityintentdefault.IconCompatParcelizer(false, this)) {
                }
                inAppMessageSlideupView = InAppMessageSlideupView.NO_ERROR;
                try {
                    inAppMessageSlideupView2 = InAppMessageSlideupView.CANCEL;
                    r0.RemoteActionCompatParcelizer(inAppMessageSlideupView, inAppMessageSlideupView2, null);
                    r3 = inAppMessageSlideupView;
                } catch (IOException e2) {
                    e = e2;
                    inAppMessageSlideupView2 = InAppMessageSlideupView.PROTOCOL_ERROR;
                    r0.RemoteActionCompatParcelizer(inAppMessageSlideupView2, inAppMessageSlideupView2, e);
                    r3 = inAppMessageSlideupView;
                }
                InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(getmainactivityintentdefault);
                r0 = createFromParcel.INSTANCE;
                return r0;
            } catch (Throwable th2) {
                th = th2;
                r0.RemoteActionCompatParcelizer(r3, inAppMessageSlideupView2, e);
                InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(getmainactivityintentdefault);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            inAppMessageSlideupView = inAppMessageSlideupView2;
        } catch (Throwable th3) {
            th = th3;
            r3 = inAppMessageSlideupView2;
            r0.RemoteActionCompatParcelizer(r3, inAppMessageSlideupView2, e);
            InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(getmainactivityintentdefault);
            throw th;
        }
    }

    public r8lambdanbCgCZH9JKHUNnWSIyypdsyJVco(createHorizontalAnimation createhorizontalanimation, getMainActivityIntentdefault getmainactivityintentdefault) {
        this.this$0 = createhorizontalanimation;
        this.reader = getmainactivityintentdefault;
    }
}
