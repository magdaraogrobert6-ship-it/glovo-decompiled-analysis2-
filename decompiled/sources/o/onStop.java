package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class onStop implements View.OnClickListener {
    public Method IconCompatParcelizer;
    public Context RemoteActionCompatParcelizer;
    public final String serializer;
    public final View write;

    public onStop(View view, String str) {
        this.write = view;
        this.serializer = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.IconCompatParcelizer != null) {
            break;
        }
        View view2 = this.write;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.serializer;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                seekAnimationsanimation_core.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view "), view2.getClass(), str);
                return;
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.IconCompatParcelizer = method;
                    this.RemoteActionCompatParcelizer = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.IconCompatParcelizer.invoke(this.RemoteActionCompatParcelizer, view);
        } catch (IllegalAccessException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not execute method for android:onClick", e2);
        }
    }
}
