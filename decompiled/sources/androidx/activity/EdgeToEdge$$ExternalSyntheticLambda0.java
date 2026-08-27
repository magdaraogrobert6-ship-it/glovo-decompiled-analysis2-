package androidx.activity;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.huawei.wisesecurity.ucs.common.utils.SpUtil;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.incognia.internal.pNP$$ExternalSyntheticLambda0;
import com.mapbox.search.IndexableDataProvidersRegistryImpl$resolve$2;
import com.mapbox.search.SearchEngineImpl$search$3;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.record.IndexableDataProviderEngineImpl;
import com.mapbox.search.record.IndexableRecord;
import com.mapbox.search.record.LocalDataProviderImpl;
import com.mapbox.search.record.LocalDataProviderImpl$DataState$Data;
import com.mapbox.search.record.LocalDataProviderImpl$DataState$Error;
import com.sentiance.core.model.events.i$c;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.protocol.createFullyDrawnExecutor;
import io.sentry.protocol.fullyDrawnReporter_delegatelambda00;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.DrawableTransformation;
import o.ParentDataModifierDefaultImpls;
import o._init_lambda1;
import o.accessupdateUnsafe;
import o.addContentView;
import o.createLayerdefault;
import o.r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4;
import o.r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s;
import o.r8lambdaJFE_chLd2jQnyQVpk_1hYHN04;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setOffset;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class EdgeToEdge$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ EdgeToEdge$$ExternalSyntheticLambda0(View view, InAppMessageFullView inAppMessageFullView, InAppMessageFull inAppMessageFull, Context context, View view2) {
        this.write = 1;
        this.MediaBrowserCompatMediaItem = view;
        this.IconCompatParcelizer = inAppMessageFullView;
        this.serializer = inAppMessageFull;
        this.RemoteActionCompatParcelizer = context;
        this.read = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 6;
        switch (this.write) {
            case 0:
                _init_lambda1 _init_lambda1Var = (_init_lambda1) this.IconCompatParcelizer;
                addContentView addcontentview = (addContentView) this.serializer;
                addContentView addcontentview2 = (addContentView) this.RemoteActionCompatParcelizer;
                ComponentActivity componentActivity = (ComponentActivity) this.read;
                View view = (View) this.MediaBrowserCompatMediaItem;
                Window window = componentActivity.getWindow();
                window.getClass();
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = addcontentview.RemoteActionCompatParcelizer;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(resources)).booleanValue();
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = addcontentview2.RemoteActionCompatParcelizer;
                Resources resources2 = view.getResources();
                resources2.getClass();
                _init_lambda1Var.read(addcontentview, addcontentview2, window, view, zBooleanValue, ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(resources2)).booleanValue());
                return;
            case 1:
                DefaultInAppMessageFullViewFactory.createInAppMessageView$lambda$4((View) this.MediaBrowserCompatMediaItem, (InAppMessageFullView) this.IconCompatParcelizer, (InAppMessageFull) this.serializer, (Context) this.RemoteActionCompatParcelizer, (View) this.read);
                return;
            case 2:
                try {
                    ((accessupdateUnsafe) this.IconCompatParcelizer).read((Context) this.RemoteActionCompatParcelizer, (setOffset) LazyKt__LazyJVMKt.read(((ParentDataModifierDefaultImpls) this.serializer).RemoteActionCompatParcelizer), (i$c) this.read, (createLayerdefault) this.MediaBrowserCompatMediaItem);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    DrawableTransformation.read(e);
                    return;
                }
            case 3:
                LocalDataProviderImpl localDataProviderImpl = (LocalDataProviderImpl) this.IconCompatParcelizer;
                String str = (String) this.serializer;
                AsyncOperationTaskImpl asyncOperationTaskImpl = (AsyncOperationTaskImpl) this.RemoteActionCompatParcelizer;
                Executor executor = (Executor) this.read;
                IndexableDataProvidersRegistryImpl$resolve$2 indexableDataProvidersRegistryImpl$resolve$2 = (IndexableDataProvidersRegistryImpl$resolve$2) this.MediaBrowserCompatMediaItem;
                SpUtil localData = localDataProviderImpl.getLocalData();
                if (localData instanceof LocalDataProviderImpl$DataState$Data) {
                    IndexableRecord indexableRecord = (IndexableRecord) ((LocalDataProviderImpl$DataState$Data) localData).records.get(str);
                    StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("get(id=", str, "): found=");
                    sbM.append(indexableRecord != null);
                    localDataProviderImpl.logD(sbM.toString());
                    asyncOperationTaskImpl.runIfNotCancelled(new SearchEngineImpl$search$3(executor, asyncOperationTaskImpl, new ZM$$ExternalSyntheticLambda0(indexableDataProvidersRegistryImpl$resolve$2, 18, indexableRecord), i));
                    return;
                }
                if (localData instanceof LocalDataProviderImpl$DataState$Error) {
                    LocalDataProviderImpl$DataState$Error localDataProviderImpl$DataState$Error = (LocalDataProviderImpl$DataState$Error) localData;
                    localDataProviderImpl.logSkippedOperation(m1$$ExternalSyntheticOutline0.m(')', "get(id=", str), localDataProviderImpl$DataState$Error);
                    asyncOperationTaskImpl.runIfNotCancelled(new SearchEngineImpl$search$3(executor, asyncOperationTaskImpl, new ZM$$ExternalSyntheticLambda0(indexableDataProvidersRegistryImpl$resolve$2, 19, localDataProviderImpl$DataState$Error), i));
                    return;
                }
                return;
            case 4:
                LocalDataProviderImpl localDataProviderImpl2 = (LocalDataProviderImpl) this.IconCompatParcelizer;
                IndexableDataProviderEngineImpl indexableDataProviderEngineImpl = (IndexableDataProviderEngineImpl) this.serializer;
                AsyncOperationTaskImpl asyncOperationTaskImpl2 = (AsyncOperationTaskImpl) this.RemoteActionCompatParcelizer;
                Executor executor2 = (Executor) this.read;
                IndexableDataProvidersRegistryImpl$resolve$2 indexableDataProvidersRegistryImpl$resolve$3 = (IndexableDataProvidersRegistryImpl$resolve$2) this.MediaBrowserCompatMediaItem;
                localDataProviderImpl2.getClass();
                executor2.getClass();
                SpUtil localData2 = localDataProviderImpl2.getLocalData();
                if (!(localData2 instanceof LocalDataProviderImpl$DataState$Data)) {
                    if (localData2 instanceof LocalDataProviderImpl$DataState$Error) {
                        LocalDataProviderImpl$DataState$Error localDataProviderImpl$DataState$Error2 = (LocalDataProviderImpl$DataState$Error) localData2;
                        localDataProviderImpl2.logSkippedOperation("registerIndexableDataProviderEngine()", localDataProviderImpl$DataState$Error2);
                        synchronized (localDataProviderImpl2.dataProviderEngineLock) {
                            for (Map.Entry entry : localDataProviderImpl2.engineRegisterListeners.entrySet()) {
                                if (entry.getKey() != null) {
                                    throw new ClassCastException();
                                }
                                ((Executor) entry.getValue()).execute(new pNP$$ExternalSyntheticLambda0(8, (LocalDataProviderImpl$DataState$Error) localData2));
                            }
                        }
                        asyncOperationTaskImpl2.runIfNotCancelled(new SearchEngineImpl$search$3(executor2, asyncOperationTaskImpl2, new ZM$$ExternalSyntheticLambda0(indexableDataProvidersRegistryImpl$resolve$3, 20, localDataProviderImpl$DataState$Error2), i));
                        return;
                    }
                    return;
                }
                LocalDataProviderImpl$DataState$Data localDataProviderImpl$DataState$Data = (LocalDataProviderImpl$DataState$Data) localData2;
                indexableDataProviderEngineImpl.upsertAll(localDataProviderImpl$DataState$Data.records.values());
                synchronized (localDataProviderImpl2.dataProviderEngineLock) {
                    localDataProviderImpl2.dataProviderEngines.add(indexableDataProviderEngineImpl);
                    for (Map.Entry entry2 : localDataProviderImpl2.engineRegisterListeners.entrySet()) {
                        if (entry2.getKey() != null) {
                            throw new ClassCastException();
                        }
                        ((Executor) entry2.getValue()).execute(new pNP$$ExternalSyntheticLambda0(7));
                    }
                }
                localDataProviderImpl2.logD("registerIndexableDataProviderEngine() completed, upserted " + localDataProviderImpl$DataState$Data.records.size() + " records");
                asyncOperationTaskImpl2.runIfNotCancelled(new SearchEngineImpl$search$3(executor2, asyncOperationTaskImpl2, new ZM$$ExternalSyntheticLambda2(14, indexableDataProvidersRegistryImpl$resolve$3), i));
                return;
            case 5:
                r8lambdaJFE_chLd2jQnyQVpk_1hYHN04.RemoteActionCompatParcelizer((Exception) this.IconCompatParcelizer, (r8lambdaJFE_chLd2jQnyQVpk_1hYHN04) this.serializer, (String) this.RemoteActionCompatParcelizer, (r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s) this.read, (r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4) this.MediaBrowserCompatMediaItem);
                return;
            case 6:
                r8lambdaJFE_chLd2jQnyQVpk_1hYHN04.serializer((r8lambdaJFE_chLd2jQnyQVpk_1hYHN04) this.IconCompatParcelizer, (String) this.serializer, (String) this.RemoteActionCompatParcelizer, (r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s) this.read, (r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4) this.MediaBrowserCompatMediaItem);
                return;
            default:
                AtomicReference atomicReference = (AtomicReference) this.IconCompatParcelizer;
                View view2 = (View) this.MediaBrowserCompatMediaItem;
                List list = (List) this.serializer;
                CountDownLatch countDownLatch = (CountDownLatch) this.RemoteActionCompatParcelizer;
                BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = (BrazeActionParserExternalSyntheticLambda0) this.read;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    createFullyDrawnExecutor createfullydrawnexecutor = new createFullyDrawnExecutor("android_view_system", arrayList);
                    fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda00Write = ViewHierarchyEventProcessor.write(view2);
                    arrayList.add(fullydrawnreporter_delegatelambda00Write);
                    ViewHierarchyEventProcessor.write(view2, fullydrawnreporter_delegatelambda00Write, list);
                    atomicReference.set(createfullydrawnexecutor);
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th) {
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to process view hierarchy.", th);
                    return;
                }
        }
    }

    public /* synthetic */ EdgeToEdge$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.write = i;
        this.IconCompatParcelizer = obj;
        this.serializer = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.read = obj4;
        this.MediaBrowserCompatMediaItem = obj5;
    }

    public /* synthetic */ EdgeToEdge$$ExternalSyntheticLambda0(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        this.write = 7;
        this.IconCompatParcelizer = atomicReference;
        this.MediaBrowserCompatMediaItem = view;
        this.serializer = list;
        this.RemoteActionCompatParcelizer = countDownLatch;
        this.read = brazeActionParserExternalSyntheticLambda0;
    }
}
