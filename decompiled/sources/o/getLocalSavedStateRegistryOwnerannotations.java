package o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class getLocalSavedStateRegistryOwnerannotations implements Externalizable {
    public boolean ComponentActivity;
    public AndroidCompositionLocals_androidKtLocalView1 IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public int RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    public boolean _init_lambda1;
    public AndroidCompositionLocals_androidKtLocalView1 _init_lambda2;
    public String _init_lambda3;
    public boolean _init_lambda4;
    public ArrayList accessensureViewModelStore;
    public boolean addContentView;
    public AndroidCompositionLocals_androidKtLocalView1 addMenuProvider;
    public String addObserverForBackInvoker;
    public String addObserverForBackInvokerlambda0;
    public AndroidCompositionLocals_androidKtLocalView1 addOnConfigurationChangedListener;
    public AndroidCompositionLocals_androidKtLocalView1 addOnMultiWindowModeChangedListener;
    public AndroidCompositionLocals_androidKtLocalView1 addOnNewIntentListener;
    public AndroidCompositionLocals_androidKtLocalView1 createFullyDrawnExecutor;
    public ArrayList defaultViewModelProviderFactory_delegatelambda0;
    public String ensureViewModelStore;
    public AndroidCompositionLocals_androidKtLocalView1 fullyDrawnReporter_delegatelambda0;
    public String fullyDrawnReporter_delegatelambda00;
    public AndroidCompositionLocals_androidKtLocalView1 getOnBackPressedInput;
    public AndroidCompositionLocals_androidKtLocalView1 getSavedStateRegistryControllerannotations;
    public String menuHostHelperlambda0;
    public AndroidCompositionLocals_androidKtLocalView1 onBackPressedDispatcher_delegatelambda0;
    public AndroidCompositionLocals_androidKtLocalView1 onBackPressedDispatcher_delegatelambda00;
    public AndroidCompositionLocals_androidKtLocalView1 onBackPressedDispatcher_delegatelambda010;
    public AndroidCompositionLocals_androidKtLocalView1 onBackPressedInput_delegatelambda0;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public boolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public boolean r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public String r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public String r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public boolean r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public boolean r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public boolean r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public AndroidCompositionLocals_androidKtLocalView1 read;
    public AndroidCompositionLocals_androidKtLocalView1 serializer;
    public AndroidCompositionLocals_androidKtLocalView1 write;

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        ArrayList arrayList = this.accessensureViewModelStore;
        ArrayList arrayList2 = this.defaultViewModelProviderFactory_delegatelambda0;
        objectOutput.writeBoolean(this.MediaDescriptionCompat);
        if (this.MediaDescriptionCompat) {
            this.serializer.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.MediaMetadataCompat);
        if (this.MediaMetadataCompat) {
            this.read.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.MediaSessionCompatResultReceiverWrapper);
        if (this.MediaSessionCompatResultReceiverWrapper) {
            this._init_lambda2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
            this.addMenuProvider.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.ComponentActivity);
        if (this.ComponentActivity) {
            this.getSavedStateRegistryControllerannotations.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
            this.onBackPressedDispatcher_delegatelambda010.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            this.fullyDrawnReporter_delegatelambda0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            this.addOnNewIntentListener.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.ResultReceiver);
        if (this.ResultReceiver) {
            this.getOnBackPressedInput.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
            this.addOnConfigurationChangedListener.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.MediaBrowserCompatMediaItem);
        if (this.MediaBrowserCompatMediaItem) {
            this.write.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) {
            this.addOnMultiWindowModeChangedListener.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) {
            this.onBackPressedDispatcher_delegatelambda0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
            this.onBackPressedDispatcher_delegatelambda00.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.MediaSessionCompatQueueItem);
        if (this.MediaSessionCompatQueueItem) {
            this.IconCompatParcelizer.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
            this.onBackPressedInput_delegatelambda0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.PlaybackStateCompat);
        if (this.PlaybackStateCompat) {
            this.createFullyDrawnExecutor.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        objectOutput.writeInt(this.RemoteActionCompatParcelizer);
        objectOutput.writeUTF(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        objectOutput.writeBoolean(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            objectOutput.writeUTF(this.fullyDrawnReporter_delegatelambda00);
        }
        objectOutput.writeBoolean(this.MediaSessionCompatToken);
        if (this.MediaSessionCompatToken) {
            objectOutput.writeUTF(this.addObserverForBackInvokerlambda0);
        }
        objectOutput.writeBoolean(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            objectOutput.writeUTF(this.menuHostHelperlambda0);
        }
        objectOutput.writeBoolean(this.PlaybackStateCompatCustomAction);
        if (this.PlaybackStateCompatCustomAction) {
            objectOutput.writeUTF(this.addObserverForBackInvoker);
        }
        objectOutput.writeBoolean(this.ParcelableVolumeInfo);
        if (this.ParcelableVolumeInfo) {
            objectOutput.writeUTF(this.ensureViewModelStore);
        }
        objectOutput.writeBoolean(this.addContentView);
        int size = arrayList2.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((AndroidCompositionLocals_androidKtLocalConfiguration1) arrayList2.get(i)).writeExternal(objectOutput);
        }
        int size2 = arrayList.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((AndroidCompositionLocals_androidKtLocalConfiguration1) arrayList.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this._init_lambda4);
        objectOutput.writeBoolean(this.RatingCompat);
        if (this.RatingCompat) {
            objectOutput.writeUTF(this._init_lambda3);
        }
        objectOutput.writeBoolean(this._init_lambda1);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView1 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView1.readExternal(objectInput);
            this.MediaDescriptionCompat = true;
            this.serializer = androidCompositionLocals_androidKtLocalView1;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView2 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView2.readExternal(objectInput);
            this.MediaMetadataCompat = true;
            this.read = androidCompositionLocals_androidKtLocalView2;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView3 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView3.readExternal(objectInput);
            this.MediaSessionCompatResultReceiverWrapper = true;
            this._init_lambda2 = androidCompositionLocals_androidKtLocalView3;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView4 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView4.readExternal(objectInput);
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
            this.addMenuProvider = androidCompositionLocals_androidKtLocalView4;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView5 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView5.readExternal(objectInput);
            this.ComponentActivity = true;
            this.getSavedStateRegistryControllerannotations = androidCompositionLocals_androidKtLocalView5;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView6 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView6.readExternal(objectInput);
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = true;
            this.onBackPressedDispatcher_delegatelambda010 = androidCompositionLocals_androidKtLocalView6;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView7 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView7.readExternal(objectInput);
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
            this.fullyDrawnReporter_delegatelambda0 = androidCompositionLocals_androidKtLocalView7;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView8 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView8.readExternal(objectInput);
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = true;
            this.addOnNewIntentListener = androidCompositionLocals_androidKtLocalView8;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView9 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView9.readExternal(objectInput);
            this.ResultReceiver = true;
            this.getOnBackPressedInput = androidCompositionLocals_androidKtLocalView9;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView10 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView10.readExternal(objectInput);
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = true;
            this.addOnConfigurationChangedListener = androidCompositionLocals_androidKtLocalView10;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView11 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView11.readExternal(objectInput);
            this.MediaBrowserCompatMediaItem = true;
            this.write = androidCompositionLocals_androidKtLocalView11;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView12 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView12.readExternal(objectInput);
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
            this.addOnMultiWindowModeChangedListener = androidCompositionLocals_androidKtLocalView12;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView13 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView13.readExternal(objectInput);
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = true;
            this.onBackPressedDispatcher_delegatelambda0 = androidCompositionLocals_androidKtLocalView13;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView14 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView14.readExternal(objectInput);
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = true;
            this.onBackPressedDispatcher_delegatelambda00 = androidCompositionLocals_androidKtLocalView14;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView15 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView15.readExternal(objectInput);
            this.MediaSessionCompatQueueItem = true;
            this.IconCompatParcelizer = androidCompositionLocals_androidKtLocalView15;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView16 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView16.readExternal(objectInput);
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
            this.onBackPressedInput_delegatelambda0 = androidCompositionLocals_androidKtLocalView16;
        }
        if (objectInput.readBoolean()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView17 = new AndroidCompositionLocals_androidKtLocalView1();
            androidCompositionLocals_androidKtLocalView17.readExternal(objectInput);
            this.PlaybackStateCompat = true;
            this.createFullyDrawnExecutor = androidCompositionLocals_androidKtLocalView17;
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = objectInput.readUTF();
        this.RemoteActionCompatParcelizer = objectInput.readInt();
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
            this.fullyDrawnReporter_delegatelambda00 = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.MediaSessionCompatToken = true;
            this.addObserverForBackInvokerlambda0 = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
            this.menuHostHelperlambda0 = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.PlaybackStateCompatCustomAction = true;
            this.addObserverForBackInvoker = utf4;
        }
        if (objectInput.readBoolean()) {
            String utf5 = objectInput.readUTF();
            this.ParcelableVolumeInfo = true;
            this.ensureViewModelStore = utf5;
        }
        this.addContentView = objectInput.readBoolean();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            AndroidCompositionLocals_androidKtLocalConfiguration1 androidCompositionLocals_androidKtLocalConfiguration1 = new AndroidCompositionLocals_androidKtLocalConfiguration1();
            androidCompositionLocals_androidKtLocalConfiguration1.readExternal(objectInput);
            this.defaultViewModelProviderFactory_delegatelambda0.add(androidCompositionLocals_androidKtLocalConfiguration1);
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            AndroidCompositionLocals_androidKtLocalConfiguration1 androidCompositionLocals_androidKtLocalConfiguration2 = new AndroidCompositionLocals_androidKtLocalConfiguration1();
            androidCompositionLocals_androidKtLocalConfiguration2.readExternal(objectInput);
            this.accessensureViewModelStore.add(androidCompositionLocals_androidKtLocalConfiguration2);
        }
        this._init_lambda4 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String utf6 = objectInput.readUTF();
            this.RatingCompat = true;
            this._init_lambda3 = utf6;
        }
        this._init_lambda1 = objectInput.readBoolean();
    }
}
