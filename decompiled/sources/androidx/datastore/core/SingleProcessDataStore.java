package androidx.datastore.core;

import androidx.datastore.preferences.core.PreferencesKt$edit$2;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.MutexImpl;
import o.FocusTransactionsKtWhenMappings;
import o.FocusTransactionsKtgrantFocus1;
import o.FocusTraversalKtWhenMappings;
import o.Focusability;
import o.IInAppMessageViewWrapper;
import o.RegistryNoModelLoaderAvailableException;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.accessgetSystemDefinedcp;
import o.canFocusimplui;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.customFocusSearchOMvw8;
import o.findActiveFocusNode;
import o.focusRect;
import o.focusSearch0X8WOeE;
import o.getActiveChild;
import o.getActiveFocusTargetNode;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getPositionInRoot;
import o.grantFocus;
import o.isAdapterPositionOnScreen;
import o.isEligibleForFocusSearch;
import o.isItemDismissable;
import o.markOnScreenCardsAsReadlambda1;
import o.onAnimationEndlambda1;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.performCustomClearFocusMxy_nc0;
import o.performCustomEnterMxy_nc0;
import o.performCustomExitMxy_nc0;
import o.performRequestFocus;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.requireActiveChild;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setCustomInAppMessageAnimationFactorylambda0;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessDataStore implements performCustomExitMxy_nc0 {
    public static final LinkedHashSet IconCompatParcelizer = new LinkedHashSet();
    public static final Object RemoteActionCompatParcelizer = new Object();
    public final isAdapterPositionOnScreen MediaBrowserCompatMediaItem;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaDescriptionCompat;
    public final Flow MediaMetadataCompat;
    public final MutableStateFlow MediaSessionCompatQueueItem;
    public final getContentViewGroupParentLayout MediaSessionCompatResultReceiverWrapper;
    public final performRequestFocus PlaybackStateCompatCustomAction;
    public List RatingCompat;
    public final ImageLoader$Builder read;
    public final performCustomEnterMxy_nc0 serializer;
    public final String write;

    @Override // o.performCustomExitMxy_nc0
    public final Flow serializer() {
        return this.MediaMetadataCompat;
    }

    public final File write() {
        return (File) this.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object writeData$datastore_core(Object obj, ContinuationImpl continuationImpl) throws IOException {
        Focusability focusability;
        File file;
        FileOutputStream fileOutputStreamWrite;
        SingleProcessDataStore singleProcessDataStore;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (continuationImpl instanceof Focusability) {
            focusability = (Focusability) continuationImpl;
            int i = focusability.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                focusability.write = i - Integer.MIN_VALUE;
            } else {
                focusability = new Focusability(this, continuationImpl);
            }
        } else {
            focusability = new Focusability(this, continuationImpl);
        }
        Object obj2 = focusability.RatingCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = focusability.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            File fileWrite = write();
            File parentFile = fileWrite.getCanonicalFile().getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(removeNodeAtDepth.write((Object) fileWrite, "Unable to create parent directories of "));
                    return null;
                }
            }
            file = new File(removeNodeAtDepth.write((Object) this.write, write().getAbsolutePath()));
            try {
                fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(file), file);
                try {
                    performRequestFocus performrequestfocus = this.PlaybackStateCompatCustomAction;
                    RegistryNoModelLoaderAvailableException registryNoModelLoaderAvailableException = new RegistryNoModelLoaderAvailableException(fileOutputStreamWrite);
                    focusability.read = this;
                    focusability.serializer = file;
                    focusability.RemoteActionCompatParcelizer = fileOutputStreamWrite;
                    focusability.IconCompatParcelizer = fileOutputStreamWrite;
                    focusability.write = 1;
                    if (performrequestfocus.writeTo(obj, registryNoModelLoaderAvailableException, focusability) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    singleProcessDataStore = this;
                    fileOutputStream = fileOutputStreamWrite;
                    fileOutputStream2 = fileOutputStream;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (IOException e) {
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream = focusability.IconCompatParcelizer;
            fileOutputStream2 = focusability.RemoteActionCompatParcelizer;
            file = focusability.serializer;
            singleProcessDataStore = focusability.read;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStreamWrite = fileOutputStream2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStreamWrite, th}, sourceInformationContextOfdefault.read());
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStream2, null}, sourceInformationContextOfdefault.read());
        if (file.renameTo(singleProcessDataStore.write())) {
            return createFromParcel.INSTANCE;
        }
        throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
    }

    public SingleProcessDataStore(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, performRequestFocus performrequestfocus, List list, performCustomEnterMxy_nc0 performcustomentermxy_nc0, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.PlaybackStateCompatCustomAction = performrequestfocus;
        this.serializer = performcustomentermxy_nc0;
        this.MediaSessionCompatResultReceiverWrapper = getcontentviewgroupparentlayout;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i = 0;
        this.MediaMetadataCompat = FlowKt.read(new SingleProcessDataStore$data$1(this, shortNewsContentCardView, i));
        this.write = ".tmp";
        this.MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new SingleProcessDataStore$file$2(i, this));
        this.MediaSessionCompatQueueItem = StateFlowKt.read(canFocusimplui.IconCompatParcelizer);
        this.RatingCompat = onContentCardDismissed.PlaybackStateCompat(list);
        int i2 = 1;
        RootViewsSpy$Companion$install$1$1 rootViewsSpy$Companion$install$1$1 = new RootViewsSpy$Companion$install$1$1(i2, this);
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this, shortNewsContentCardView, i2);
        getcontentviewgroupparentlayout.getClass();
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder();
        imageLoader$Builder.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        imageLoader$Builder.IconCompatParcelizer = singleProcessDataStore$data$1;
        imageLoader$Builder.read = SQLite.IconCompatParcelizer(Integer.MAX_VALUE, 6, (IInAppMessageViewWrapper) null);
        imageLoader$Builder.serializer = new AtomicInteger(0);
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) getcontentviewgroupparentlayout.getCoroutineContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.IconCompatParcelizer(new FocusTransactionsKtWhenMappings(rootViewsSpy$Companion$install$1$1, i, imageLoader$Builder));
        }
        this.read = imageLoader$Builder;
    }

    @Override // o.performCustomExitMxy_nc0
    public final Object updateData(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        CompletableDeferredImpl completableDeferredImplWrite = JobKt.write();
        this.read.read(new findActiveFocusNode(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, completableDeferredImplWrite, (accessgetSystemDefinedcp) this.MediaSessionCompatQueueItem.read(), shortNewsContentCardView.getContext()));
        Object objAwaitInternal = completableDeferredImplWrite.awaitInternal(shortNewsContentCardView);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objAwaitInternal;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final Object access$handleUpdate(SingleProcessDataStore singleProcessDataStore, findActiveFocusNode findactivefocusnode, ContinuationImpl continuationImpl) {
        FocusTransactionsKtgrantFocus1 focusTransactionsKtgrantFocus1;
        findActiveFocusNode findactivefocusnode2;
        CompletableDeferredImpl completableDeferredImpl;
        SingleProcessDataStore singleProcessDataStore2;
        CompletableDeferredImpl completableDeferredImpl2;
        Object objTransformAndWrite;
        CompletableDeferredImpl completableDeferredImpl3;
        Throwable thSerializer;
        if (continuationImpl instanceof FocusTransactionsKtgrantFocus1) {
            focusTransactionsKtgrantFocus1 = (FocusTransactionsKtgrantFocus1) continuationImpl;
            int i = focusTransactionsKtgrantFocus1.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                focusTransactionsKtgrantFocus1.read = i - Integer.MIN_VALUE;
            } else {
                focusTransactionsKtgrantFocus1 = new FocusTransactionsKtgrantFocus1(singleProcessDataStore, continuationImpl);
            }
        } else {
            focusTransactionsKtgrantFocus1 = new FocusTransactionsKtgrantFocus1(singleProcessDataStore, continuationImpl);
        }
        Object isitemdismissable = focusTransactionsKtgrantFocus1.write;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = focusTransactionsKtgrantFocus1.read;
        if (i2 != 0) {
            try {
                if (i2 != 1) {
                    if (i2 == 2) {
                        CompletableDeferredImpl completableDeferredImpl4 = focusTransactionsKtgrantFocus1.serializer;
                        SingleProcessDataStore singleProcessDataStore3 = focusTransactionsKtgrantFocus1.RemoteActionCompatParcelizer;
                        findactivefocusnode2 = (findActiveFocusNode) focusTransactionsKtgrantFocus1.IconCompatParcelizer;
                        ExtrasKt.RemoteActionCompatParcelizer(isitemdismissable);
                        completableDeferredImpl2 = completableDeferredImpl4;
                        singleProcessDataStore2 = singleProcessDataStore3;
                        try {
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = findactivefocusnode2.IconCompatParcelizer;
                            TextAnnouncementContentCardView textAnnouncementContentCardView = findactivefocusnode2.RemoteActionCompatParcelizer;
                            focusTransactionsKtgrantFocus1.IconCompatParcelizer = completableDeferredImpl2;
                            focusTransactionsKtgrantFocus1.RemoteActionCompatParcelizer = null;
                            focusTransactionsKtgrantFocus1.serializer = null;
                            focusTransactionsKtgrantFocus1.read = 3;
                            objTransformAndWrite = singleProcessDataStore2.transformAndWrite(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, textAnnouncementContentCardView, focusTransactionsKtgrantFocus1);
                            if (objTransformAndWrite != obj) {
                                isitemdismissable = objTransformAndWrite;
                                completableDeferredImpl3 = completableDeferredImpl2;
                                thSerializer = onItemDismiss.serializer(isitemdismissable);
                                if (thSerializer == null) {
                                    completableDeferredImpl3.MediaSessionCompatQueueItem(isitemdismissable);
                                } else {
                                    completableDeferredImpl3.IconCompatParcelizer(thSerializer);
                                }
                                return createFromParcel.INSTANCE;
                            }
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            completableDeferredImpl = completableDeferredImpl2;
                            singleProcessDataStore = completableDeferredImpl;
                            isitemdismissable = new isItemDismissable(th);
                            completableDeferredImpl3 = singleProcessDataStore;
                        }
                    } else if (i2 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                CompletableDeferredImpl completableDeferredImpl5 = (CompletableDeferredImpl) focusTransactionsKtgrantFocus1.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(isitemdismissable);
                completableDeferredImpl3 = completableDeferredImpl5;
            } catch (Throwable th2) {
                th = th2;
                isitemdismissable = new isItemDismissable(th);
                completableDeferredImpl3 = singleProcessDataStore;
            }
            thSerializer = onItemDismiss.serializer(isitemdismissable);
            if (thSerializer == null) {
                completableDeferredImpl3.MediaSessionCompatQueueItem(isitemdismissable);
            } else {
                completableDeferredImpl3.IconCompatParcelizer(thSerializer);
            }
            return createFromParcel.INSTANCE;
        }
        ExtrasKt.RemoteActionCompatParcelizer(isitemdismissable);
        CompletableDeferredImpl completableDeferredImpl6 = findactivefocusnode.read;
        try {
            accessgetSystemDefinedcp accessgetsystemdefinedcp = (accessgetSystemDefinedcp) singleProcessDataStore.MediaSessionCompatQueueItem.read();
            if (accessgetsystemdefinedcp instanceof performCustomClearFocusMxy_nc0) {
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = findactivefocusnode.IconCompatParcelizer;
                TextAnnouncementContentCardView textAnnouncementContentCardView2 = findactivefocusnode.RemoteActionCompatParcelizer;
                focusTransactionsKtgrantFocus1.IconCompatParcelizer = completableDeferredImpl6;
                focusTransactionsKtgrantFocus1.read = 1;
                Object objTransformAndWrite2 = singleProcessDataStore.transformAndWrite(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, textAnnouncementContentCardView2, focusTransactionsKtgrantFocus1);
                if (objTransformAndWrite2 != obj) {
                    isitemdismissable = objTransformAndWrite2;
                    completableDeferredImpl3 = completableDeferredImpl6;
                    thSerializer = onItemDismiss.serializer(isitemdismissable);
                    if (thSerializer == null) {
                        completableDeferredImpl3.MediaSessionCompatQueueItem(isitemdismissable);
                    } else {
                        completableDeferredImpl3.IconCompatParcelizer(thSerializer);
                    }
                    return createFromParcel.INSTANCE;
                }
            } else {
                if (!(accessgetsystemdefinedcp instanceof requireActiveChild) && !(accessgetsystemdefinedcp instanceof canFocusimplui)) {
                    if (accessgetsystemdefinedcp instanceof grantFocus) {
                        throw ((grantFocus) accessgetsystemdefinedcp).write;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (accessgetsystemdefinedcp != findactivefocusnode.serializer) {
                    throw ((requireActiveChild) accessgetsystemdefinedcp).IconCompatParcelizer;
                }
                focusTransactionsKtgrantFocus1.IconCompatParcelizer = findactivefocusnode;
                focusTransactionsKtgrantFocus1.RemoteActionCompatParcelizer = singleProcessDataStore;
                focusTransactionsKtgrantFocus1.serializer = completableDeferredImpl6;
                focusTransactionsKtgrantFocus1.read = 2;
                if (singleProcessDataStore.readAndInitOrPropagateAndThrowFailure(focusTransactionsKtgrantFocus1) != obj) {
                    findactivefocusnode2 = findactivefocusnode;
                    singleProcessDataStore2 = singleProcessDataStore;
                    completableDeferredImpl2 = completableDeferredImpl6;
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = findactivefocusnode2.IconCompatParcelizer;
                    TextAnnouncementContentCardView textAnnouncementContentCardView3 = findactivefocusnode2.RemoteActionCompatParcelizer;
                    focusTransactionsKtgrantFocus1.IconCompatParcelizer = completableDeferredImpl2;
                    focusTransactionsKtgrantFocus1.RemoteActionCompatParcelizer = null;
                    focusTransactionsKtgrantFocus1.serializer = null;
                    focusTransactionsKtgrantFocus1.read = 3;
                    objTransformAndWrite = singleProcessDataStore2.transformAndWrite(r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, textAnnouncementContentCardView3, focusTransactionsKtgrantFocus1);
                    if (objTransformAndWrite != obj) {
                        isitemdismissable = objTransformAndWrite;
                        completableDeferredImpl3 = completableDeferredImpl2;
                        thSerializer = onItemDismiss.serializer(isitemdismissable);
                        if (thSerializer == null) {
                            completableDeferredImpl3.MediaSessionCompatQueueItem(isitemdismissable);
                        } else {
                            completableDeferredImpl3.IconCompatParcelizer(thSerializer);
                        }
                        return createFromParcel.INSTANCE;
                    }
                }
            }
            return obj;
        } catch (Throwable th3) {
            th = th3;
            completableDeferredImpl = completableDeferredImpl6;
            singleProcessDataStore = completableDeferredImpl;
            isitemdismissable = new isItemDismissable(th);
            completableDeferredImpl3 = singleProcessDataStore;
            thSerializer = onItemDismiss.serializer(isitemdismissable);
            if (thSerializer == null) {
                completableDeferredImpl3.MediaSessionCompatQueueItem(isitemdismissable);
            } else {
                completableDeferredImpl3.IconCompatParcelizer(thSerializer);
            }
            return createFromParcel.INSTANCE;
        }
        isitemdismissable = new isItemDismissable(th);
        completableDeferredImpl3 = singleProcessDataStore;
        thSerializer = onItemDismiss.serializer(isitemdismissable);
        if (thSerializer == null) {
            completableDeferredImpl3.MediaSessionCompatQueueItem(isitemdismissable);
        } else {
            completableDeferredImpl3.IconCompatParcelizer(thSerializer);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:41:0x0121  */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0134  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:0: B:33:0x00e9->B:57:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object readAndInit(ContinuationImpl continuationImpl) throws CorruptionException, FileNotFoundException {
        customFocusSearchOMvw8 customfocussearchomvw8;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        SingleProcessDataStore singleProcessDataStore;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2;
        cancelPendingWebViewPause cancelpendingwebviewpause;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator it;
        cancelPendingWebViewPause cancelpendingwebviewpause2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber3;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1;
        SingleProcessDataStore singleProcessDataStore2;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        Object obj;
        int iHashCode;
        if (continuationImpl instanceof customFocusSearchOMvw8) {
            customfocussearchomvw8 = (customFocusSearchOMvw8) continuationImpl;
            int i = customfocussearchomvw8.RatingCompat;
            if ((i & Integer.MIN_VALUE) != 0) {
                customfocussearchomvw8.RatingCompat = i - Integer.MIN_VALUE;
            } else {
                customfocussearchomvw8 = new customFocusSearchOMvw8(this, continuationImpl);
            }
        } else {
            customfocussearchomvw8 = new customFocusSearchOMvw8(this, continuationImpl);
        }
        Object obj2 = customfocussearchomvw8.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = customfocussearchomvw8.RatingCompat;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            MutableStateFlow mutableStateFlow = this.MediaSessionCompatQueueItem;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mutableStateFlow.read(), canFocusimplui.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && !(mutableStateFlow.read() instanceof requireActiveChild)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
                return null;
            }
            MutexImpl mutexImplIconCompatParcelizer = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
            createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            customfocussearchomvw8.serializer = this;
            customfocussearchomvw8.RemoteActionCompatParcelizer = mutexImplIconCompatParcelizer;
            customfocussearchomvw8.IconCompatParcelizer = createinappmessageeventsubscriber;
            customfocussearchomvw8.read = createinappmessageeventsubscriber;
            customfocussearchomvw8.RatingCompat = 1;
            Object dataOrHandleCorruption = readDataOrHandleCorruption(customfocussearchomvw8);
            if (dataOrHandleCorruption != coroutineSingletons) {
                setcustominappmessageanimationfactorylambda0 = mutexImplIconCompatParcelizer;
                singleProcessDataStore = this;
                createinappmessageeventsubscriber2 = createinappmessageeventsubscriber;
                obj2 = dataOrHandleCorruption;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            createinappmessageeventsubscriber = (createInAppMessageEventSubscriber) customfocussearchomvw8.read;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber4 = (createInAppMessageEventSubscriber) customfocussearchomvw8.IconCompatParcelizer;
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda2 = (setCustomInAppMessageAnimationFactorylambda0) customfocussearchomvw8.RemoteActionCompatParcelizer;
            SingleProcessDataStore singleProcessDataStore3 = customfocussearchomvw8.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda2;
            singleProcessDataStore = singleProcessDataStore3;
            createinappmessageeventsubscriber2 = createinappmessageeventsubscriber4;
        } else {
            if (i2 == 2) {
                it = customfocussearchomvw8.MediaBrowserCompatMediaItem;
                singleProcessDataStore$readAndInit$api$1 = customfocussearchomvw8.write;
                cancelpendingwebviewpause = (cancelPendingWebViewPause) customfocussearchomvw8.read;
                createinappmessageeventsubscriber2 = (createInAppMessageEventSubscriber) customfocussearchomvw8.IconCompatParcelizer;
                setcustominappmessageanimationfactorylambda0 = (setCustomInAppMessageAnimationFactorylambda0) customfocussearchomvw8.RemoteActionCompatParcelizer;
                singleProcessDataStore = customfocussearchomvw8.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                while (it.hasNext()) {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) it.next();
                    customfocussearchomvw8.serializer = singleProcessDataStore;
                    customfocussearchomvw8.RemoteActionCompatParcelizer = setcustominappmessageanimationfactorylambda0;
                    customfocussearchomvw8.IconCompatParcelizer = createinappmessageeventsubscriber2;
                    customfocussearchomvw8.read = cancelpendingwebviewpause;
                    customfocussearchomvw8.write = singleProcessDataStore$readAndInit$api$1;
                    customfocussearchomvw8.MediaBrowserCompatMediaItem = it;
                    customfocussearchomvw8.RatingCompat = 2;
                    if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(singleProcessDataStore$readAndInit$api$1, customfocussearchomvw8) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                cancelpendingwebviewpause2 = cancelpendingwebviewpause;
                singleProcessDataStore.RatingCompat = null;
                customfocussearchomvw8.serializer = singleProcessDataStore;
                customfocussearchomvw8.RemoteActionCompatParcelizer = createinappmessageeventsubscriber2;
                customfocussearchomvw8.IconCompatParcelizer = cancelpendingwebviewpause2;
                customfocussearchomvw8.read = setcustominappmessageanimationfactorylambda0;
                customfocussearchomvw8.write = null;
                customfocussearchomvw8.MediaBrowserCompatMediaItem = null;
                customfocussearchomvw8.RatingCompat = 3;
                if (setcustominappmessageanimationfactorylambda0.lock(customfocussearchomvw8) != coroutineSingletons) {
                    createinappmessageeventsubscriber3 = createinappmessageeventsubscriber2;
                    setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                    singleProcessDataStore2 = singleProcessDataStore;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) customfocussearchomvw8.read;
            cancelpendingwebviewpause2 = (cancelPendingWebViewPause) customfocussearchomvw8.IconCompatParcelizer;
            createinappmessageeventsubscriber3 = (createInAppMessageEventSubscriber) customfocussearchomvw8.RemoteActionCompatParcelizer;
            singleProcessDataStore2 = customfocussearchomvw8.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        try {
            cancelpendingwebviewpause2.IconCompatParcelizer = true;
            setcustominappmessageanimationfactorylambda1.write(null);
            MutableStateFlow mutableStateFlow2 = singleProcessDataStore2.MediaSessionCompatQueueItem;
            obj = createinappmessageeventsubscriber3.IconCompatParcelizer;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            mutableStateFlow2.IconCompatParcelizer(new performCustomClearFocusMxy_nc0(iHashCode, obj));
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            setcustominappmessageanimationfactorylambda1.write(null);
            throw th;
        }
        createinappmessageeventsubscriber.IconCompatParcelizer = obj2;
        cancelpendingwebviewpause = new cancelPendingWebViewPause();
        singleProcessDataStore$readAndInit$api$1 = new SingleProcessDataStore$readAndInit$api$1(setcustominappmessageanimationfactorylambda0, cancelpendingwebviewpause, createinappmessageeventsubscriber2, singleProcessDataStore);
        List list = singleProcessDataStore.RatingCompat;
        if (list == null) {
            cancelpendingwebviewpause2 = cancelpendingwebviewpause;
            singleProcessDataStore.RatingCompat = null;
            customfocussearchomvw8.serializer = singleProcessDataStore;
            customfocussearchomvw8.RemoteActionCompatParcelizer = createinappmessageeventsubscriber2;
            customfocussearchomvw8.IconCompatParcelizer = cancelpendingwebviewpause2;
            customfocussearchomvw8.read = setcustominappmessageanimationfactorylambda0;
            customfocussearchomvw8.write = null;
            customfocussearchomvw8.MediaBrowserCompatMediaItem = null;
            customfocussearchomvw8.RatingCompat = 3;
            if (setcustominappmessageanimationfactorylambda0.lock(customfocussearchomvw8) != coroutineSingletons) {
                createinappmessageeventsubscriber3 = createinappmessageeventsubscriber2;
                setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                singleProcessDataStore2 = singleProcessDataStore;
                cancelpendingwebviewpause2.IconCompatParcelizer = true;
                setcustominappmessageanimationfactorylambda1.write(null);
                MutableStateFlow mutableStateFlow3 = singleProcessDataStore2.MediaSessionCompatQueueItem;
                obj = createinappmessageeventsubscriber3.IconCompatParcelizer;
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                mutableStateFlow3.IconCompatParcelizer(new performCustomClearFocusMxy_nc0(iHashCode, obj));
                return createFromParcel.INSTANCE;
            }
        } else {
            it = list.iterator();
            while (it.hasNext()) {
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) it.next();
                customfocussearchomvw8.serializer = singleProcessDataStore;
                customfocussearchomvw8.RemoteActionCompatParcelizer = setcustominappmessageanimationfactorylambda0;
                customfocussearchomvw8.IconCompatParcelizer = createinappmessageeventsubscriber2;
                customfocussearchomvw8.read = cancelpendingwebviewpause;
                customfocussearchomvw8.write = singleProcessDataStore$readAndInit$api$1;
                customfocussearchomvw8.MediaBrowserCompatMediaItem = it;
                customfocussearchomvw8.RatingCompat = 2;
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(singleProcessDataStore$readAndInit$api$1, customfocussearchomvw8) == coroutineSingletons) {
                }
            }
            cancelpendingwebviewpause2 = cancelpendingwebviewpause;
            singleProcessDataStore.RatingCompat = null;
            customfocussearchomvw8.serializer = singleProcessDataStore;
            customfocussearchomvw8.RemoteActionCompatParcelizer = createinappmessageeventsubscriber2;
            customfocussearchomvw8.IconCompatParcelizer = cancelpendingwebviewpause2;
            customfocussearchomvw8.read = setcustominappmessageanimationfactorylambda0;
            customfocussearchomvw8.write = null;
            customfocussearchomvw8.MediaBrowserCompatMediaItem = null;
            customfocussearchomvw8.RatingCompat = 3;
            if (setcustominappmessageanimationfactorylambda0.lock(customfocussearchomvw8) != coroutineSingletons) {
                createinappmessageeventsubscriber3 = createinappmessageeventsubscriber2;
                setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                singleProcessDataStore2 = singleProcessDataStore;
                cancelpendingwebviewpause2.IconCompatParcelizer = true;
                setcustominappmessageanimationfactorylambda1.write(null);
                MutableStateFlow mutableStateFlow4 = singleProcessDataStore2.MediaSessionCompatQueueItem;
                obj = createinappmessageeventsubscriber3.IconCompatParcelizer;
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                mutableStateFlow4.IconCompatParcelizer(new performCustomClearFocusMxy_nc0(iHashCode, obj));
                return createFromParcel.INSTANCE;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readAndInitOrPropagateAndThrowFailure(ContinuationImpl continuationImpl) throws Throwable {
        FocusTraversalKtWhenMappings focusTraversalKtWhenMappings;
        SingleProcessDataStore singleProcessDataStore;
        if (continuationImpl instanceof FocusTraversalKtWhenMappings) {
            focusTraversalKtWhenMappings = (FocusTraversalKtWhenMappings) continuationImpl;
            int i = focusTraversalKtWhenMappings.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                focusTraversalKtWhenMappings.read = i - Integer.MIN_VALUE;
            } else {
                focusTraversalKtWhenMappings = new FocusTraversalKtWhenMappings(this, continuationImpl);
            }
        } else {
            focusTraversalKtWhenMappings = new FocusTraversalKtWhenMappings(this, continuationImpl);
        }
        Object obj = focusTraversalKtWhenMappings.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = focusTraversalKtWhenMappings.read;
        if (i2 != 0) {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            singleProcessDataStore = focusTraversalKtWhenMappings.write;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createFromParcel.INSTANCE;
            } catch (Throwable th) {
                th = th;
                singleProcessDataStore.MediaSessionCompatQueueItem.IconCompatParcelizer(new requireActiveChild(th));
                throw th;
            }
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        try {
            focusTraversalKtWhenMappings.write = this;
            focusTraversalKtWhenMappings.read = 1;
            if (readAndInit(focusTraversalKtWhenMappings) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return createFromParcel.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            singleProcessDataStore = this;
            singleProcessDataStore.MediaSessionCompatQueueItem.IconCompatParcelizer(new requireActiveChild(th));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readAndInitOrPropagateFailure(ContinuationImpl continuationImpl) {
        getActiveChild getactivechild;
        SingleProcessDataStore singleProcessDataStore;
        if (continuationImpl instanceof getActiveChild) {
            getactivechild = (getActiveChild) continuationImpl;
            int i = getactivechild.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                getactivechild.write = i - Integer.MIN_VALUE;
            } else {
                getactivechild = new getActiveChild(this, continuationImpl);
            }
        } else {
            getactivechild = new getActiveChild(this, continuationImpl);
        }
        Object obj = getactivechild.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getactivechild.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                getactivechild.serializer = this;
                getactivechild.write = 1;
                if (readAndInit(getactivechild) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                th = th;
                singleProcessDataStore = this;
                singleProcessDataStore.MediaSessionCompatQueueItem.IconCompatParcelizer(new requireActiveChild(th));
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            singleProcessDataStore = getactivechild.serializer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore.MediaSessionCompatQueueItem.IconCompatParcelizer(new requireActiveChild(th));
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.isEligibleForFocusSearch] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final Object readData(ContinuationImpl continuationImpl) throws FileNotFoundException {
        ?? iseligibleforfocussearch;
        FileInputStream fileInputStream;
        Throwable th;
        if (continuationImpl instanceof isEligibleForFocusSearch) {
            isEligibleForFocusSearch iseligibleforfocussearch2 = (isEligibleForFocusSearch) continuationImpl;
            int i = iseligibleforfocussearch2.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                iseligibleforfocussearch2.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                iseligibleforfocussearch = iseligibleforfocussearch2;
            } else {
                iseligibleforfocussearch = new isEligibleForFocusSearch(this, continuationImpl);
            }
        } else {
            iseligibleforfocussearch = new isEligibleForFocusSearch(this, continuationImpl);
        }
        Object obj = iseligibleforfocussearch.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = iseligibleforfocussearch.RemoteActionCompatParcelizer;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fileInputStream = iseligibleforfocussearch.write;
                iseligibleforfocussearch = iseligibleforfocussearch.serializer;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStream, null}, sourceInformationContextOfdefault.read());
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStream, th}, sourceInformationContextOfdefault.read());
                        throw th3;
                    }
                }
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                File fileWrite = write();
                FileInputStream fileInputStreamWrite = getActiveFocusTargetNode.write(fileWrite, new FileInputStream(fileWrite));
                try {
                    performRequestFocus performrequestfocus = this.PlaybackStateCompatCustomAction;
                    iseligibleforfocussearch.serializer = this;
                    iseligibleforfocussearch.write = fileInputStreamWrite;
                    iseligibleforfocussearch.RemoteActionCompatParcelizer = 1;
                    Object objRemoteActionCompatParcelizer = performrequestfocus.RemoteActionCompatParcelizer(fileInputStreamWrite);
                    if (objRemoteActionCompatParcelizer == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fileInputStream = fileInputStreamWrite;
                    obj = objRemoteActionCompatParcelizer;
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStream, null}, sourceInformationContextOfdefault.read());
                    return obj;
                } catch (Throwable th4) {
                    fileInputStream = fileInputStreamWrite;
                    th = th4;
                    iseligibleforfocussearch = this;
                    throw th;
                }
            } catch (FileNotFoundException e) {
                e = e;
                iseligibleforfocussearch = this;
                if (iseligibleforfocussearch.write().exists()) {
                    throw e;
                }
                return iseligibleforfocussearch.PlaybackStateCompatCustomAction.write();
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readDataOrHandleCorruption(ContinuationImpl continuationImpl) throws CorruptionException, FileNotFoundException {
        focusSearch0X8WOeE focussearch0x8woee;
        SingleProcessDataStore singleProcessDataStore;
        Object objIconCompatParcelizer;
        CorruptionException corruptionException;
        SingleProcessDataStore singleProcessDataStore2;
        CorruptionException corruptionException2;
        if (continuationImpl instanceof focusSearch0X8WOeE) {
            focussearch0x8woee = (focusSearch0X8WOeE) continuationImpl;
            int i = focussearch0x8woee.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                focussearch0x8woee.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                focussearch0x8woee = new focusSearch0X8WOeE(this, continuationImpl);
            }
        } else {
            focussearch0x8woee = new focusSearch0X8WOeE(this, continuationImpl);
        }
        Object obj = focussearch0x8woee.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = focussearch0x8woee.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                focussearch0x8woee.read = this;
                focussearch0x8woee.RemoteActionCompatParcelizer = 1;
                Object data = readData(focussearch0x8woee);
                if (data == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return data;
            } catch (CorruptionException e) {
                e = e;
                singleProcessDataStore = this;
                performCustomEnterMxy_nc0 performcustomentermxy_nc0 = singleProcessDataStore.serializer;
                focussearch0x8woee.read = singleProcessDataStore;
                focussearch0x8woee.serializer = e;
                focussearch0x8woee.RemoteActionCompatParcelizer = 2;
                objIconCompatParcelizer = performcustomentermxy_nc0.IconCompatParcelizer(e);
                if (objIconCompatParcelizer != coroutineSingletons) {
                    SingleProcessDataStore singleProcessDataStore3 = singleProcessDataStore;
                    corruptionException = e;
                    obj = objIconCompatParcelizer;
                    singleProcessDataStore2 = singleProcessDataStore3;
                    focussearch0x8woee.read = corruptionException;
                    focussearch0x8woee.serializer = obj;
                    focussearch0x8woee.RemoteActionCompatParcelizer = 3;
                    if (singleProcessDataStore2.writeData$datastore_core(obj, focussearch0x8woee) == coroutineSingletons) {
                        return obj;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    corruptionException = (CorruptionException) focussearch0x8woee.serializer;
                    singleProcessDataStore2 = (SingleProcessDataStore) focussearch0x8woee.read;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    try {
                        focussearch0x8woee.read = corruptionException;
                        focussearch0x8woee.serializer = obj;
                        focussearch0x8woee.RemoteActionCompatParcelizer = 3;
                        if (singleProcessDataStore2.writeData$datastore_core(obj, focussearch0x8woee) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return obj;
                    } catch (IOException e2) {
                        e = e2;
                        corruptionException2 = corruptionException;
                    }
                } else {
                    if (i2 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = focussearch0x8woee.serializer;
                    corruptionException2 = (CorruptionException) focussearch0x8woee.read;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj2;
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
                markOnScreenCardsAsReadlambda1.read(corruptionException2, e);
                throw corruptionException2;
            }
            singleProcessDataStore = (SingleProcessDataStore) focussearch0x8woee.read;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            } catch (CorruptionException e4) {
                e = e4;
            }
        }
        performCustomEnterMxy_nc0 performcustomentermxy_nc1 = singleProcessDataStore.serializer;
        focussearch0x8woee.read = singleProcessDataStore;
        focussearch0x8woee.serializer = e;
        focussearch0x8woee.RemoteActionCompatParcelizer = 2;
        objIconCompatParcelizer = performcustomentermxy_nc1.IconCompatParcelizer(e);
        if (objIconCompatParcelizer != coroutineSingletons) {
            SingleProcessDataStore singleProcessDataStore4 = singleProcessDataStore;
            corruptionException = e;
            obj = objIconCompatParcelizer;
            singleProcessDataStore2 = singleProcessDataStore4;
            focussearch0x8woee.read = corruptionException;
            focussearch0x8woee.serializer = obj;
            focussearch0x8woee.RemoteActionCompatParcelizer = 3;
            if (singleProcessDataStore2.writeData$datastore_core(obj, focussearch0x8woee) == coroutineSingletons) {
                return obj;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object transformAndWrite(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, TextAnnouncementContentCardView textAnnouncementContentCardView, ContinuationImpl continuationImpl) throws Throwable {
        focusRect focusrect;
        Object obj;
        SingleProcessDataStore singleProcessDataStore;
        performCustomClearFocusMxy_nc0 performcustomclearfocusmxy_nc0;
        Object obj2;
        SingleProcessDataStore singleProcessDataStore2;
        if (continuationImpl instanceof focusRect) {
            focusrect = (focusRect) continuationImpl;
            int i = focusrect.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                focusrect.serializer = i - Integer.MIN_VALUE;
            } else {
                focusrect = new focusRect(this, continuationImpl);
            }
        } else {
            focusrect = new focusRect(this, continuationImpl);
        }
        Object obj3 = focusrect.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = focusrect.serializer;
        if (i2 != 0) {
            if (i2 == 1) {
                obj = focusrect.IconCompatParcelizer;
                performcustomclearfocusmxy_nc0 = (performCustomClearFocusMxy_nc0) focusrect.read;
                singleProcessDataStore = focusrect.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = focusrect.read;
                singleProcessDataStore2 = focusrect.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
            }
            singleProcessDataStore2.MediaSessionCompatQueueItem.IconCompatParcelizer(new performCustomClearFocusMxy_nc0(obj2 != null ? obj2.hashCode() : 0, obj2));
            return obj2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj3);
        performCustomClearFocusMxy_nc0 performcustomclearfocusmxy_nc1 = (performCustomClearFocusMxy_nc0) this.MediaSessionCompatQueueItem.read();
        Object obj4 = performcustomclearfocusmxy_nc1.IconCompatParcelizer;
        if ((obj4 != null ? obj4.hashCode() : 0) != performcustomclearfocusmxy_nc1.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        obj = performcustomclearfocusmxy_nc1.IconCompatParcelizer;
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, obj, (ShortNewsContentCardView) null);
        focusrect.RemoteActionCompatParcelizer = this;
        focusrect.read = performcustomclearfocusmxy_nc1;
        focusrect.IconCompatParcelizer = obj;
        focusrect.serializer = 1;
        Object objWithContext = BuildersKt.withContext(textAnnouncementContentCardView, preferencesKt$edit$2, focusrect);
        if (objWithContext != coroutineSingletons) {
            singleProcessDataStore = this;
            performcustomclearfocusmxy_nc0 = performcustomclearfocusmxy_nc1;
            obj3 = objWithContext;
        }
        return coroutineSingletons;
        Object obj5 = performcustomclearfocusmxy_nc0.IconCompatParcelizer;
        if ((obj5 != null ? obj5.hashCode() : 0) != performcustomclearfocusmxy_nc0.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, obj3}, getCieXyz.write())).booleanValue()) {
            return obj;
        }
        focusrect.RemoteActionCompatParcelizer = singleProcessDataStore;
        focusrect.read = obj3;
        focusrect.IconCompatParcelizer = null;
        focusrect.serializer = 2;
        if (singleProcessDataStore.writeData$datastore_core(obj3, focusrect) != coroutineSingletons) {
            obj2 = obj3;
            singleProcessDataStore2 = singleProcessDataStore;
            singleProcessDataStore2.MediaSessionCompatQueueItem.IconCompatParcelizer(new performCustomClearFocusMxy_nc0(obj2 != null ? obj2.hashCode() : 0, obj2));
            return obj2;
        }
        return coroutineSingletons;
    }
}
