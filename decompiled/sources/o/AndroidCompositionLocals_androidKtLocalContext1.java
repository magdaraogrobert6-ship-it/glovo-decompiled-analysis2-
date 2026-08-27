package o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidCompositionLocals_androidKtLocalContext1 implements Externalizable {
    public ArrayList serializer;

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        ArrayList arrayList = this.serializer;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((getLocalSavedStateRegistryOwnerannotations) arrayList.get(i)).writeExternal(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations = new getLocalSavedStateRegistryOwnerannotations();
            getlocalsavedstateregistryownerannotations.serializer = null;
            getlocalsavedstateregistryownerannotations.read = null;
            getlocalsavedstateregistryownerannotations._init_lambda2 = null;
            getlocalsavedstateregistryownerannotations.addMenuProvider = null;
            getlocalsavedstateregistryownerannotations.getSavedStateRegistryControllerannotations = null;
            getlocalsavedstateregistryownerannotations.onBackPressedDispatcher_delegatelambda010 = null;
            getlocalsavedstateregistryownerannotations.fullyDrawnReporter_delegatelambda0 = null;
            getlocalsavedstateregistryownerannotations.addOnNewIntentListener = null;
            getlocalsavedstateregistryownerannotations.getOnBackPressedInput = null;
            getlocalsavedstateregistryownerannotations.addOnConfigurationChangedListener = null;
            getlocalsavedstateregistryownerannotations.write = null;
            getlocalsavedstateregistryownerannotations.addOnMultiWindowModeChangedListener = null;
            getlocalsavedstateregistryownerannotations.onBackPressedDispatcher_delegatelambda0 = null;
            getlocalsavedstateregistryownerannotations.onBackPressedDispatcher_delegatelambda00 = null;
            getlocalsavedstateregistryownerannotations.IconCompatParcelizer = null;
            getlocalsavedstateregistryownerannotations.onBackPressedInput_delegatelambda0 = null;
            getlocalsavedstateregistryownerannotations.createFullyDrawnExecutor = null;
            getlocalsavedstateregistryownerannotations.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = "";
            getlocalsavedstateregistryownerannotations.RemoteActionCompatParcelizer = 0;
            getlocalsavedstateregistryownerannotations.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = "";
            getlocalsavedstateregistryownerannotations.fullyDrawnReporter_delegatelambda00 = "";
            getlocalsavedstateregistryownerannotations.addObserverForBackInvokerlambda0 = "";
            getlocalsavedstateregistryownerannotations.menuHostHelperlambda0 = "";
            getlocalsavedstateregistryownerannotations.addObserverForBackInvoker = "";
            getlocalsavedstateregistryownerannotations.ensureViewModelStore = "";
            getlocalsavedstateregistryownerannotations.addContentView = false;
            getlocalsavedstateregistryownerannotations.defaultViewModelProviderFactory_delegatelambda0 = new ArrayList();
            getlocalsavedstateregistryownerannotations.accessensureViewModelStore = new ArrayList();
            getlocalsavedstateregistryownerannotations._init_lambda4 = false;
            getlocalsavedstateregistryownerannotations._init_lambda3 = "";
            getlocalsavedstateregistryownerannotations._init_lambda1 = false;
            getlocalsavedstateregistryownerannotations.readExternal(objectInput);
            this.serializer.add(getlocalsavedstateregistryownerannotations);
        }
    }
}
