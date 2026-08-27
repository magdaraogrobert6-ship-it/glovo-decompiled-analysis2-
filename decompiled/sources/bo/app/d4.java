package bo.app;

import android.content.Context;
import com.braze.Constants;
import com.braze.enums.CardKey;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageEventSubscriber;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.requestDisplayInAppMessagelambda7;
import o.resetAfterInAppMessageCloselambda2;
import o.resetTransientState;
import o.setWasCloseMessageCalled;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d4 implements ICardStorageProvider {
    public static final Set k = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{CardKey.VIEWED.getKey(), CardKey.DISMISSED.getKey()});
    public final String a;
    public final h2 b;
    public final com.braze.storage.b c;
    public long d;
    public long e;
    public final LinkedHashSet f;
    public final LinkedHashSet g;
    public final LinkedHashSet h;
    public Map i;
    public final x3 j;

    public static final String d(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Server card was locally dismissed already. Not adding card to storage. Server card: ", jSONObject);
    }

    public static final String e(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Server card has expired already. Not adding card to storage. Server card: ", jSONObject);
    }

    public static final String g(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Card not present in storage for id: ", str);
    }

    public static final String h(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to read card json from storage. Json: ", str);
    }

    public static final String j(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Removing card from test cache: ", str);
    }

    public static final String k(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Removing card from storage with id: ", str);
    }

    public static final String l(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Server card is marked as removed. Removing from card storage with id: ", str);
    }

    public static final String m(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: ", str);
    }

    public static final String n(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Can't update card field. Json cannot be parsed from disk or is not present. Id: ", str);
    }

    public static final String o(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Removing card from storage with id: ", str);
    }

    public static final String p(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Writing card to storage with id: ", str);
    }

    public final void b(String str) {
        String strRemoteActionCompatParcelizer;
        str.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 18), 6, (Object) null);
        LinkedHashSet linkedHashSet = this.g;
        linkedHashSet.add(str);
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
            }
            bVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final void c() {
        ArrayList<String> arrayList;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = bVar.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                    List list = instance_delegatelambda0.write;
                    if (!zSerializer) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                                isverticalswipeinalloweddirection.getClass();
                                list = (List) isverticalswipeinalloweddirection.serializer(str, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0));
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str), 4, (Object) null);
                            }
                        }
                    }
                    arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            try {
                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(new JSONObject(str2).getString(CardKey.ID.getKey()), str2);
            } catch (JSONException e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str2, 1), 4, (Object) null);
                onviewattachedtowindowlambda0 = null;
            }
            if (onviewattachedtowindowlambda0 != null) {
                arrayList2.add(onviewattachedtowindowlambda0);
            }
        }
        this.i = new LinkedHashMap(onMove.serializer(arrayList2));
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final Object getCachedCardsAsEvent() {
        return a(true, (Long) null);
    }

    public final void i(String str) {
        String strRemoteActionCompatParcelizer;
        str.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 16), 6, (Object) null);
        LinkedHashSet linkedHashSet = this.g;
        linkedHashSet.remove(str);
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
            }
            bVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final JSONObject f(String str) {
        str.getClass();
        String str2 = (String) this.i.get(str);
        if (str2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 19), 7, (Object) null);
            return null;
        }
        try {
            return new JSONObject(str2);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str2, 10), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsClicked(String str) {
        str.getClass();
        a(str, CardKey.CLICKED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsDismissed(String str) {
        str.getClass();
        a(str);
        a(str, (JSONObject) null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsViewed(String str) {
        str.getClass();
        a(str, CardKey.VIEWED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsVisuallyRead(String str) {
        str.getClass();
        a(str, CardKey.READ);
    }

    public final ContentCardsUpdatedEvent a(a4 a4Var, String str) {
        String strRemoteActionCompatParcelizer;
        a4Var.getClass();
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createinappmessageeventsubscriber.IconCompatParcelizer = str;
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(3), 7, (Object) null);
            createinappmessageeventsubscriber.IconCompatParcelizer = "";
        }
        int i = 0;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, createinappmessageeventsubscriber.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda2(createinappmessageeventsubscriber, i, this), 6, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda3(createinappmessageeventsubscriber, 0), 6, (Object) null);
        long j = a4Var.a;
        if (j != -1) {
            this.d = j;
            this.c.writeData(DataStoreKey.LAST_CARD_UPDATED_AT, Long.valueOf(j));
        }
        long j2 = a4Var.b;
        if (j2 != -1) {
            this.e = j2;
            this.c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, Long.valueOf(j2));
        }
        this.c.writeData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, Long.valueOf(DateTimeUtils.nowInSeconds()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JSONArray jSONArray = a4Var.d;
        if (jSONArray != null && jSONArray.length() != 0) {
            requestDisplayInAppMessagelambda7 requestdisplayinappmessagelambda7 = resetAfterInAppMessageCloselambda2.read(onContentCardDismissed.read((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(jSONArray.length())}, BackspaceCommand.write(), -281231677, BackspaceCommand.write())), new b4(jSONArray));
            c4 c4Var = new c4(jSONArray);
            Iterator it = requestdisplayinappmessagelambda7.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) c4Var.invoke(it.next());
                a(jSONObject);
                String string = jSONObject.getString(CardKey.ID.getKey());
                string.getClass();
                linkedHashSet.add(string);
            }
        }
        if (a4Var.c) {
            this.f.retainAll(linkedHashSet);
            com.braze.storage.b bVar = this.c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(this.f);
            String strRemoteActionCompatParcelizer2 = "{}";
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                        isverticalswipeinalloweddirection.getClass();
                        strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                        strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
                    }
                    bVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                }
            }
            LinkedHashSet linkedHashSet2 = this.h;
            linkedHashSet2.retainAll(linkedHashSet);
            com.braze.storage.b bVar2 = this.c;
            DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
            List listPlaybackStateCompat2 = onContentCardDismissed.PlaybackStateCompat(linkedHashSet2);
            if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                        isverticalswipeinalloweddirection2.getClass();
                        strRemoteActionCompatParcelizer2 = isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat2);
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                        if (!(listPlaybackStateCompat2 instanceof Map) && (listPlaybackStateCompat2 instanceof List)) {
                            strRemoteActionCompatParcelizer2 = "[]";
                        }
                    }
                    bVar2.writeData(dataStoreKey2, strRemoteActionCompatParcelizer2);
                } catch (Exception e4) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey2), 8, (Object) null);
                }
            }
            linkedHashSet.addAll(this.g);
            a(linkedHashSet);
        }
        return a(false, (Long) null);
    }

    public d4(Context context, String str, String str2, h2 h2Var) {
        ArrayList arrayList;
        List list;
        ArrayList arrayList2;
        List list2;
        ArrayList arrayList3;
        context.getClass();
        str.getClass();
        str2.getClass();
        h2Var.getClass();
        this.a = str;
        this.b = h2Var;
        com.braze.storage.b bVar = new com.braze.storage.b(context, str, str2);
        this.c = bVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f = linkedHashSet;
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
        this.i = new LinkedHashMap();
        this.j = new x3();
        c();
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        DataStoreValueType type = dataStoreKey.getType();
        DataStoreValueType dataStoreValueType = DataStoreValueType.LIST;
        List list3 = instance_delegatelambda0.write;
        if (type != dataStoreValueType) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = bVar.readData(dataStoreKey, "");
                data.getClass();
                String str3 = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str3).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                                isverticalswipeinalloweddirection.getClass();
                                list = (List) isverticalswipeinalloweddirection.serializer(str3, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0));
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str3), 4, (Object) null);
                                list = list3;
                            }
                        }
                        arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                    }
                    list = list3;
                    arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        linkedHashSet.addAll(arrayList);
        LinkedHashSet linkedHashSet2 = this.h;
        com.braze.storage.b bVar2 = this.c;
        DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
        if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKey2), 12, (Object) null);
            arrayList2 = new ArrayList();
        } else {
            try {
                Object data2 = bVar2.readData(dataStoreKey2, "");
                data2.getClass();
                String str4 = (String) data2;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) {
                    arrayList2 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) {
                        Object[] objArr2 = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str4).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                            try {
                                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                                isverticalswipeinalloweddirection2.getClass();
                                list2 = (List) isverticalswipeinalloweddirection2.serializer(str4, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0));
                            } catch (Exception e3) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str4), 4, (Object) null);
                                list2 = list3;
                            }
                        }
                        arrayList2 = onContentCardDismissed.IconCompatParcelizer((Collection) list2);
                    }
                    list2 = list3;
                    arrayList2 = onContentCardDismissed.IconCompatParcelizer((Collection) list2);
                }
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.j(dataStoreKey2), 8, (Object) null);
                arrayList2 = new ArrayList();
            }
        }
        linkedHashSet2.addAll(arrayList2);
        LinkedHashSet linkedHashSet3 = this.g;
        com.braze.storage.b bVar3 = this.c;
        DataStoreKey dataStoreKey3 = DataStoreKey.TEST_CARDS;
        if (dataStoreKey3.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKey3), 12, (Object) null);
            arrayList3 = new ArrayList();
        } else {
            try {
                Object data3 = bVar3.readData(dataStoreKey3, "");
                data3.getClass();
                String str5 = (String) data3;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str5)) {
                    arrayList3 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str5)) {
                        Object[] objArr3 = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str5).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                            try {
                                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection3 = resetTransientState.read;
                                isverticalswipeinalloweddirection3.getClass();
                                list3 = (List) isverticalswipeinalloweddirection3.serializer(str5, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0));
                            } catch (Exception e5) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e5, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str5), 4, (Object) null);
                            }
                        }
                    }
                    arrayList3 = onContentCardDismissed.IconCompatParcelizer((Collection) list3);
                }
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e6, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.j(dataStoreKey3), 8, (Object) null);
                arrayList3 = new ArrayList();
            }
        }
        linkedHashSet3.addAll(arrayList3);
        com.braze.storage.b bVar4 = this.c;
        DataStoreKey dataStoreKey4 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        Object data4 = bVar4.readData(dataStoreKey4, "");
        data4.getClass();
        String str6 = (String) data4;
        if (!Constants.BRAZE_SDK_VERSION.equals(str6)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str6, 0), 6, (Object) null);
            this.c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
            this.c.writeData(dataStoreKey4, Constants.BRAZE_SDK_VERSION);
        }
        Object data5 = this.c.readData(DataStoreKey.LAST_CARD_UPDATED_AT, 0L);
        data5.getClass();
        this.d = ((Long) data5).longValue();
        Object data6 = this.c.readData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
        data6.getClass();
        this.e = ((Long) data6).longValue();
    }

    public static final String d() {
        return "The server card received is older than the cached card. Not updating the cached card.";
    }

    public static final String e() {
        return "Input user id was null. Defaulting to the empty user id";
    }

    public static final String d(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse card JSON, skipping: ", str);
    }

    public static final String e(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Deleting expired card from storage with id: ", str);
    }

    public static final String b(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Server card json: ", jSONObject);
    }

    public static final String b() {
        return "Clearing content card storage.";
    }

    public static final String c(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Adding card to test cache: ", str);
    }

    public static final String c(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Cached card json: ", jSONObject);
    }

    public final void a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        String strRemoteActionCompatParcelizer;
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(this.f);
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(this.h);
        String string = jSONObject.getString(CardKey.ID.getKey());
        string.getClass();
        JSONObject jSONObjectF = f(string);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 4), 7, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObjectF, 5), 7, (Object) null);
        if (jSONObjectF != null) {
            String key = CardKey.CREATED.getKey();
            if (jSONObjectF.has(key) && jSONObject.has(key) && jSONObjectF.getLong(key) > jSONObject.getLong(key)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(1), 6, (Object) null);
                return;
            }
        }
        CardKey cardKey = CardKey.REMOVED;
        cardKey.getClass();
        String key2 = cardKey.getKey();
        if (jSONObject.has(key2) && jSONObject.getBoolean(key2)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(string, 11), 7, (Object) null);
            this.f.remove(string);
            com.braze.storage.b bVar = this.c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(this.f);
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                        isverticalswipeinalloweddirection.getClass();
                        strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                        strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
                    }
                    bVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                }
            }
            i(string);
            a(string, (JSONObject) null);
            return;
        }
        if (setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(string)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 6), 7, (Object) null);
            return;
        }
        if (setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2.contains(string)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 7), 7, (Object) null);
            return;
        }
        CardKey cardKey2 = CardKey.DISMISSED;
        cardKey2.getClass();
        String key3 = cardKey2.getKey();
        if (jSONObject.has(key3) && jSONObject.getBoolean(key3)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(string, 12), 7, (Object) null);
            a(string);
            a(string, (JSONObject) null);
            return;
        }
        if (jSONObjectF == null) {
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObjectF.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObjectF.get(next));
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (k.contains(next2)) {
                    jSONObject2.put(next2, jSONObjectF.getBoolean(next2) || jSONObject.getBoolean(next2));
                } else {
                    jSONObject2.put(next2, jSONObject.get(next2));
                }
            }
        }
        a(string, jSONObject2);
        CardKey cardKey3 = CardKey.IS_TEST;
        cardKey3.getClass();
        String key4 = cardKey3.getKey();
        if (jSONObject.has(key4) && jSONObject.getBoolean(key4)) {
            b(string);
        }
    }

    public static final String a(String str, String str2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Detected SDK update from '", str, "' -> '", str2, "'. Clearing config update time.");
    }

    public static final String a(createInAppMessageEventSubscriber createinappmessageeventsubscriber, d4 d4Var) {
        return "The received cards are for user " + createinappmessageeventsubscriber.IconCompatParcelizer + " and the current user is " + d4Var.a + " , the cards will be discarded and no changes will be made.";
    }

    public static final String a(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return m1$$ExternalSyntheticOutline0.m(createinappmessageeventsubscriber.IconCompatParcelizer, "Updating offline Content Cards for user with id: ");
    }

    public final ContentCardsUpdatedEvent a(boolean z, Long l) {
        long jLongValue;
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List listA = q3.a(jSONArray, this.b, this, this.j);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listA) {
            if (((Card) obj).isExpired()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a((Card) it2.next());
        }
        String str = this.a;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            Object data = this.c.readData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, 0L);
            data.getClass();
            jLongValue = ((Long) data).longValue();
        }
        return new ContentCardsUpdatedEvent(arrayList3, str, jLongValue, z);
    }

    public final void a(Card card) {
        String strRemoteActionCompatParcelizer;
        card.getClass();
        String id = card.getId();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(id, 9), 7, (Object) null);
        a(id, (JSONObject) null);
        id.getClass();
        this.h.add(id);
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.EXPIRED_CARDS;
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(this.h);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                    strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
                }
                bVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
            }
        }
        i(id);
    }

    public final void a(String str, CardKey cardKey) {
        Boolean bool = Boolean.TRUE;
        str.getClass();
        cardKey.getClass();
        JSONObject jSONObjectF = f(str);
        if (jSONObjectF == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 15), 7, (Object) null);
            return;
        }
        try {
            jSONObjectF.put(cardKey.getKey(), bool);
            a(str, jSONObjectF);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(9, cardKey), 4, (Object) null);
        }
    }

    public static final String a(Object obj, CardKey cardKey) {
        return "Failed to update card json field to " + obj + " with key: " + cardKey;
    }

    public final void a(String str, JSONObject jSONObject) {
        String strRemoteActionCompatParcelizer;
        str.getClass();
        if (jSONObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 13), 7, (Object) null);
            this.i.remove(str);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 14), 7, (Object) null);
            this.i.put(str, jSONObject.toString());
        }
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(this.i.values());
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
            }
            bVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(String str) {
        String strRemoteActionCompatParcelizer;
        str.getClass();
        this.f.add(str);
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(this.f);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
            }
            bVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(LinkedHashSet linkedHashSet) {
        String strRemoteActionCompatParcelizer;
        linkedHashSet.getClass();
        Set setKeySet = this.i.keySet();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ah$$ExternalSyntheticLambda0(linkedHashSet, 28, setKeySet), 7, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!linkedHashSet.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 17), 7, (Object) null);
            this.i.remove(str);
        }
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(this.i.values());
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
            }
            bVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(Set set, Set set2) {
        return "Retaining card ids: " + set + " among cached card ids: " + set2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(2), 7, (Object) null);
        this.i.clear();
        this.h.clear();
        this.c.clearAllData();
    }
}
