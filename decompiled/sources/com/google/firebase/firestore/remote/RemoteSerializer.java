package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.ServerTimestampOperation;
import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.Cursor;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.DocumentTransform;
import com.google.firestore.v1.Function;
import com.google.firestore.v1.Precondition;
import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.Target;
import com.google.firestore.v1.Value;
import com.google.firestore.v1.Write;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.AndroidComposeViewAccessibilityDelegateCompat_androidKtWhenMappings;
import o.AndroidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1;
import o.AndroidComposeViewAssistHelperMethodsO;
import o.AndroidComposeViewForceDarkModeQ;
import o.CompositionLocalsKtLocalUriHandler1;
import o.NodeCoordinatorCompaniononCommitAffectingLayer1;
import o.NodeCoordinatorCompaniononCommitAffectingLayerParams1;
import o.NodeCoordinatorKt;
import o.NodeCoordinatordrawBlock1;
import o.NodeCoordinatoroutOfBoundsHit1;
import o.NodeCoordinatorspeculativeHit1;
import o.NodeKind;
import o.NodeKindKt;
import o.accesscompareEquals;
import o.accessgetOnCommitAffectingLayercp;
import o.accessgetSnapshotObserver;
import o.accessnextUntilhw7D004;
import o.autoInvalidateInsertedNode;
import o.autoInvalidateNodeIncludingDelegates;
import o.autoInvalidateNodeSelf;
import o.autoInvalidateRemovedNode;
import o.calculateNodeKindSetFromIncludingDelegates;
import o.childHitTestqzLsGqo;
import o.compareEquals;
import o.diffForWindowMetricsChanged;
import o.disallowForceDark;
import o.dispatchHoverEventui;
import o.encodedString;
import o.entityTypeOLwlOKw;
import o.excludeLineAndPageGranularities;
import o.fillVector;
import o.fromParentRect;
import o.getDisableContentCapture;
import o.getDisableContentCaptureannotations;
import o.getIncludeSelfInTraversalH91voCI;
import o.getRectManager;
import o.isScreenReaderFocusable;
import o.linearDiffAborted;
import o.nextUntilhw7D004;
import o.nodeReused;
import o.onRequestMeasuredefault;
import o.onShowTranslation;
import o.performActionHelper;
import o.sendTypeViewScrolledAccessibilityEvent;
import o.setBefore;
import o.setContentInvalid;
import o.setShouldAttachOnInsert;
import o.shareWithSiblings;
import o.updateHoveredVirtualView;
import o.updateUnsafe;
import o.visitNodes;
import o.visitNodesaLcG6gQ;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteSerializer {
    public final visitNodesaLcG6gQ IconCompatParcelizer;
    public final String read;

    public static shareWithSiblings IconCompatParcelizer(shareWithSiblings sharewithsiblings) {
        getRectManager.RemoteActionCompatParcelizer(sharewithsiblings.IconCompatParcelizer.size() > 4 && sharewithsiblings.RemoteActionCompatParcelizer(4).equals("documents"), "Tried to deserialize invalid key %s", sharewithsiblings);
        return (shareWithSiblings) sharewithsiblings.read();
    }

    public static fillVector serializer(StructuredQuery.Filter filter) {
        linearDiffAborted lineardiffaborted;
        updateUnsafe updateunsafe;
        int i = onRequestMeasuredefault.MediaMetadataCompat[filter.getFilterTypeCase().ordinal()];
        if (i == 1) {
            StructuredQuery.CompositeFilter compositeFilter = filter.getCompositeFilter();
            ArrayList arrayList = new ArrayList();
            Iterator<StructuredQuery.Filter> it = compositeFilter.getFiltersList().iterator();
            while (it.hasNext()) {
                arrayList.add(serializer(it.next()));
            }
            int i2 = onRequestMeasuredefault.MediaSessionCompatQueueItem[compositeFilter.getOp().ordinal()];
            if (i2 == 1) {
                lineardiffaborted = linearDiffAborted.AND;
            } else {
                if (i2 != 2) {
                    getRectManager.write("Only AND and OR composite filter types are supported.", new Object[0]);
                    throw null;
                }
                lineardiffaborted = linearDiffAborted.OR;
            }
            return new setShouldAttachOnInsert(arrayList, lineardiffaborted);
        }
        if (i != 2) {
            if (i != 3) {
                getRectManager.write("Unrecognized Filter.filterType %d", filter.getFilterTypeCase());
                throw null;
            }
            StructuredQuery.UnaryFilter unaryFilter = filter.getUnaryFilter();
            childHitTestqzLsGqo childhittestqzlsgqo = childHitTestqzLsGqo.read(unaryFilter.getField().getFieldPath());
            int i3 = onRequestMeasuredefault.ParcelableVolumeInfo[unaryFilter.getOp().ordinal()];
            if (i3 == 1) {
                return nodeReused.IconCompatParcelizer(childhittestqzlsgqo, updateUnsafe.EQUAL, NodeCoordinatorCompaniononCommitAffectingLayer1.ResultReceiver);
            }
            if (i3 == 2) {
                return nodeReused.IconCompatParcelizer(childhittestqzlsgqo, updateUnsafe.EQUAL, NodeCoordinatorCompaniononCommitAffectingLayer1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            }
            if (i3 == 3) {
                return nodeReused.IconCompatParcelizer(childhittestqzlsgqo, updateUnsafe.NOT_EQUAL, NodeCoordinatorCompaniononCommitAffectingLayer1.ResultReceiver);
            }
            if (i3 == 4) {
                return nodeReused.IconCompatParcelizer(childhittestqzlsgqo, updateUnsafe.NOT_EQUAL, NodeCoordinatorCompaniononCommitAffectingLayer1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            }
            getRectManager.write("Unrecognized UnaryFilter.operator %d", unaryFilter.getOp());
            throw null;
        }
        StructuredQuery.FieldFilter fieldFilter = filter.getFieldFilter();
        childHitTestqzLsGqo childhittestqzlsgqo2 = childHitTestqzLsGqo.read(fieldFilter.getField().getFieldPath());
        StructuredQuery.FieldFilter.read op = fieldFilter.getOp();
        switch (onRequestMeasuredefault.MediaDescriptionCompat[op.ordinal()]) {
            case 1:
                updateunsafe = updateUnsafe.LESS_THAN;
                break;
            case 2:
                updateunsafe = updateUnsafe.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                updateunsafe = updateUnsafe.EQUAL;
                break;
            case 4:
                updateunsafe = updateUnsafe.NOT_EQUAL;
                break;
            case 5:
                updateunsafe = updateUnsafe.GREATER_THAN_OR_EQUAL;
                break;
            case 6:
                updateunsafe = updateUnsafe.GREATER_THAN;
                break;
            case 7:
                updateunsafe = updateUnsafe.ARRAY_CONTAINS;
                break;
            case 8:
                updateunsafe = updateUnsafe.IN;
                break;
            case 9:
                updateunsafe = updateUnsafe.ARRAY_CONTAINS_ANY;
                break;
            case 10:
                updateunsafe = updateUnsafe.NOT_IN;
                break;
            default:
                getRectManager.write("Unhandled FieldFilter.operator %d", op);
                throw null;
        }
        return nodeReused.IconCompatParcelizer(childhittestqzlsgqo2, updateunsafe, fieldFilter.getValue());
    }

    public static autoInvalidateInsertedNode write(Value value) {
        int i = onRequestMeasuredefault.PlaybackStateCompat[value.getValueTypeCase().ordinal()];
        if (i == 1) {
            return new autoInvalidateRemovedNode(childHitTestqzLsGqo.read(value.getFieldReferenceValue()));
        }
        if (i != 2) {
            return new calculateNodeKindSetFromIncludingDelegates(value);
        }
        Function functionValue = value.getFunctionValue();
        String name = functionValue.getName();
        ArrayList arrayList = new ArrayList();
        Iterator<Value> it = functionValue.getArgsList().iterator();
        while (it.hasNext()) {
            arrayList.add(write(it.next()));
        }
        return new autoInvalidateNodeSelf(name, arrayList, getIncludeSelfInTraversalH91voCI.read);
    }

    public final NodeCoordinatorKt RemoteActionCompatParcelizer(Write write) {
        accessnextUntilhw7D004 accessnextuntilhw7d004;
        NodeCoordinatorspeculativeHit1 nodeCoordinatorspeculativeHit1;
        accessnextUntilhw7D004 accessnextuntilhw7d005;
        if (write.hasCurrentDocument()) {
            Precondition currentDocument = write.getCurrentDocument();
            int i = onRequestMeasuredefault.MediaBrowserCompatMediaItem[currentDocument.getConditionTypeCase().ordinal()];
            if (i == 1) {
                accessnextuntilhw7d005 = new accessnextUntilhw7D004(write(currentDocument.getUpdateTime()), null);
            } else if (i == 2) {
                accessnextuntilhw7d005 = new accessnextUntilhw7D004(null, Boolean.valueOf(currentDocument.getExists()));
            } else {
                if (i != 3) {
                    getRectManager.write("Unknown precondition", new Object[0]);
                    throw null;
                }
                accessnextuntilhw7d004 = accessnextUntilhw7D004.serializer;
            }
            accessnextuntilhw7d004 = accessnextuntilhw7d005;
        } else {
            accessnextuntilhw7d004 = accessnextUntilhw7D004.serializer;
        }
        accessnextUntilhw7D004 accessnextuntilhw7d006 = accessnextuntilhw7d004;
        ArrayList arrayList = new ArrayList();
        for (DocumentTransform.FieldTransform fieldTransform : write.getUpdateTransformsList()) {
            int i2 = onRequestMeasuredefault.IconCompatParcelizer[fieldTransform.getTransformTypeCase().ordinal()];
            if (i2 == 1) {
                getRectManager.RemoteActionCompatParcelizer(fieldTransform.getSetToServerValue() == DocumentTransform.FieldTransform.serializer.REQUEST_TIME, "Unknown transform setToServerValue: %s", fieldTransform.getSetToServerValue());
                nodeCoordinatorspeculativeHit1 = new NodeCoordinatorspeculativeHit1(childHitTestqzLsGqo.read(fieldTransform.getFieldPath()), ServerTimestampOperation.IconCompatParcelizer);
            } else if (i2 == 2) {
                nodeCoordinatorspeculativeHit1 = new NodeCoordinatorspeculativeHit1(childHitTestqzLsGqo.read(fieldTransform.getFieldPath()), new NodeCoordinatordrawBlock1(fieldTransform.getAppendMissingElements().getValuesList()));
            } else if (i2 == 3) {
                nodeCoordinatorspeculativeHit1 = new NodeCoordinatorspeculativeHit1(childHitTestqzLsGqo.read(fieldTransform.getFieldPath()), new NodeCoordinatorCompaniononCommitAffectingLayerParams1(fieldTransform.getRemoveAllFromArray().getValuesList()));
            } else {
                if (i2 != 4) {
                    getRectManager.write("Unknown FieldTransform proto: %s", fieldTransform);
                    throw null;
                }
                childHitTestqzLsGqo childhittestqzlsgqo = childHitTestqzLsGqo.read(fieldTransform.getFieldPath());
                Value increment = fieldTransform.getIncrement();
                NodeKind nodeKind = new NodeKind();
                getRectManager.RemoteActionCompatParcelizer(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(increment) || (increment != null && increment.hasDoubleValue()), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
                nodeKind.IconCompatParcelizer = increment;
                nodeCoordinatorspeculativeHit1 = new NodeCoordinatorspeculativeHit1(childhittestqzlsgqo, nodeKind);
            }
            arrayList.add(nodeCoordinatorspeculativeHit1);
        }
        int i3 = onRequestMeasuredefault.PlaybackStateCompatCustomAction[write.getOperationCase().ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                return new NodeCoordinatoroutOfBoundsHit1(IconCompatParcelizer(write.getDelete()), accessnextuntilhw7d006);
            }
            if (i3 == 3) {
                return new autoInvalidateNodeIncludingDelegates(IconCompatParcelizer(write.getVerify()), accessnextuntilhw7d006);
            }
            getRectManager.write("Unknown mutation operation: %d", write.getOperationCase());
            throw null;
        }
        if (!write.hasUpdateMask()) {
            return new nextUntilhw7D004(IconCompatParcelizer(write.getUpdate().getName()), new entityTypeOLwlOKw(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(write.getUpdate().getFieldsMap())), accessnextuntilhw7d006, arrayList);
        }
        visitNodes visitnodesIconCompatParcelizer = IconCompatParcelizer(write.getUpdate().getName());
        entityTypeOLwlOKw entitytypeolwlokw = new entityTypeOLwlOKw(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(write.getUpdate().getFieldsMap()));
        DocumentMask updateMask = write.getUpdateMask();
        int fieldPathsCount = updateMask.getFieldPathsCount();
        HashSet hashSet = new HashSet(fieldPathsCount);
        for (int i4 = 0; i4 < fieldPathsCount; i4++) {
            hashSet.add(childHitTestqzLsGqo.read(updateMask.getFieldPaths(i4)));
        }
        return new compareEquals(visitnodesIconCompatParcelizer, entitytypeolwlokw, new accesscompareEquals(hashSet), accessnextuntilhw7d006, arrayList);
    }

    public final String serializer(visitNodes visitnodes) {
        return read(this.IconCompatParcelizer, visitnodes.RemoteActionCompatParcelizer);
    }

    public RemoteSerializer(visitNodesaLcG6gQ visitnodesalcg6gq) {
        this.IconCompatParcelizer = visitnodesalcg6gq;
        this.read = write(visitnodesalcg6gq).write();
    }

    public static StructuredQuery.Filter RemoteActionCompatParcelizer(StructuredQuery.FieldReference fieldReference, StructuredQuery.UnaryFilter.write writeVar) {
        disallowForceDark disallowforcedarkNewBuilder = StructuredQuery.UnaryFilter.newBuilder();
        disallowforcedarkNewBuilder.RemoteActionCompatParcelizer();
        ((StructuredQuery.UnaryFilter) disallowforcedarkNewBuilder.RemoteActionCompatParcelizer).setField(fieldReference);
        disallowforcedarkNewBuilder.RemoteActionCompatParcelizer();
        ((StructuredQuery.UnaryFilter) disallowforcedarkNewBuilder.RemoteActionCompatParcelizer).setOp(writeVar);
        AndroidComposeViewAssistHelperMethodsO androidComposeViewAssistHelperMethodsONewBuilder = StructuredQuery.Filter.newBuilder();
        androidComposeViewAssistHelperMethodsONewBuilder.RemoteActionCompatParcelizer();
        ((StructuredQuery.Filter) androidComposeViewAssistHelperMethodsONewBuilder.RemoteActionCompatParcelizer).setUnaryFilter((StructuredQuery.UnaryFilter) disallowforcedarkNewBuilder.serializer());
        return (StructuredQuery.Filter) androidComposeViewAssistHelperMethodsONewBuilder.serializer();
    }

    public static shareWithSiblings read(String str) {
        shareWithSiblings sharewithsiblingsIconCompatParcelizer = shareWithSiblings.IconCompatParcelizer(str);
        boolean z = false;
        if (sharewithsiblingsIconCompatParcelizer.IconCompatParcelizer.size() >= 4 && sharewithsiblingsIconCompatParcelizer.RemoteActionCompatParcelizer(0).equals("projects") && sharewithsiblingsIconCompatParcelizer.RemoteActionCompatParcelizer(2).equals("databases")) {
            z = true;
        }
        getRectManager.RemoteActionCompatParcelizer(z, "Tried to deserialize invalid key %s", sharewithsiblingsIconCompatParcelizer);
        return sharewithsiblingsIconCompatParcelizer;
    }

    public static Timestamp write(com.google.firebase.Timestamp timestamp) {
        encodedString encodedstringNewBuilder = Timestamp.newBuilder();
        long j = timestamp.IconCompatParcelizer;
        encodedstringNewBuilder.RemoteActionCompatParcelizer();
        ((Timestamp) encodedstringNewBuilder.RemoteActionCompatParcelizer).setSeconds(j);
        int i = timestamp.RemoteActionCompatParcelizer;
        encodedstringNewBuilder.RemoteActionCompatParcelizer();
        ((Timestamp) encodedstringNewBuilder.RemoteActionCompatParcelizer).setNanos(i);
        return (Timestamp) encodedstringNewBuilder.serializer();
    }

    public static shareWithSiblings write(visitNodesaLcG6gQ visitnodesalcg6gq) {
        List listAsList = Arrays.asList("projects", visitnodesalcg6gq.write, "databases", visitnodesalcg6gq.serializer);
        shareWithSiblings sharewithsiblings = shareWithSiblings.serializer;
        return listAsList.isEmpty() ? shareWithSiblings.serializer : new shareWithSiblings(listAsList);
    }

    public final Write read(NodeCoordinatorKt nodeCoordinatorKt) {
        Precondition precondition;
        GeneratedMessageLite generatedMessageLiteSerializer;
        diffForWindowMetricsChanged diffforwindowmetricschangedNewBuilder = Write.newBuilder();
        if (nodeCoordinatorKt instanceof nextUntilhw7D004) {
            visitNodes visitnodes = nodeCoordinatorKt.read;
            entityTypeOLwlOKw entitytypeolwlokw = ((nextUntilhw7D004) nodeCoordinatorKt).write;
            setContentInvalid setcontentinvalidNewBuilder = Document.newBuilder();
            String strSerializer = serializer(visitnodes);
            setcontentinvalidNewBuilder.RemoteActionCompatParcelizer();
            ((Document) setcontentinvalidNewBuilder.RemoteActionCompatParcelizer).setName(strSerializer);
            Map<String, Value> fieldsMap = entitytypeolwlokw.serializer().getMapValue().getFieldsMap();
            setcontentinvalidNewBuilder.RemoteActionCompatParcelizer();
            ((Document) setcontentinvalidNewBuilder.RemoteActionCompatParcelizer).getMutableFieldsMap().putAll(fieldsMap);
            Document document = (Document) setcontentinvalidNewBuilder.serializer();
            diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer();
            ((Write) diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer).setUpdate(document);
        } else if (nodeCoordinatorKt instanceof compareEquals) {
            visitNodes visitnodes2 = nodeCoordinatorKt.read;
            compareEquals compareequals = (compareEquals) nodeCoordinatorKt;
            entityTypeOLwlOKw entitytypeolwlokw2 = compareequals.write;
            setContentInvalid setcontentinvalidNewBuilder2 = Document.newBuilder();
            String strSerializer2 = serializer(visitnodes2);
            setcontentinvalidNewBuilder2.RemoteActionCompatParcelizer();
            ((Document) setcontentinvalidNewBuilder2.RemoteActionCompatParcelizer).setName(strSerializer2);
            Map<String, Value> fieldsMap2 = entitytypeolwlokw2.serializer().getMapValue().getFieldsMap();
            setcontentinvalidNewBuilder2.RemoteActionCompatParcelizer();
            ((Document) setcontentinvalidNewBuilder2.RemoteActionCompatParcelizer).getMutableFieldsMap().putAll(fieldsMap2);
            Document document2 = (Document) setcontentinvalidNewBuilder2.serializer();
            diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer();
            ((Write) diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer).setUpdate(document2);
            accesscompareEquals accesscompareequals = compareequals.RemoteActionCompatParcelizer;
            updateHoveredVirtualView updatehoveredvirtualviewNewBuilder = DocumentMask.newBuilder();
            Iterator it = accesscompareequals.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                String strWrite = ((childHitTestqzLsGqo) it.next()).write();
                updatehoveredvirtualviewNewBuilder.RemoteActionCompatParcelizer();
                ((DocumentMask) updatehoveredvirtualviewNewBuilder.RemoteActionCompatParcelizer).addFieldPaths(strWrite);
            }
            DocumentMask documentMask = (DocumentMask) updatehoveredvirtualviewNewBuilder.serializer();
            diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer();
            ((Write) diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer).setUpdateMask(documentMask);
        } else if (nodeCoordinatorKt instanceof NodeCoordinatoroutOfBoundsHit1) {
            String strSerializer3 = serializer(nodeCoordinatorKt.read);
            diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer();
            ((Write) diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer).setDelete(strSerializer3);
        } else {
            if (!(nodeCoordinatorKt instanceof autoInvalidateNodeIncludingDelegates)) {
                getRectManager.write("unknown mutation type %s", nodeCoordinatorKt.getClass());
                throw null;
            }
            String strSerializer4 = serializer(nodeCoordinatorKt.read);
            diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer();
            ((Write) diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer).setVerify(strSerializer4);
        }
        ArrayList<NodeCoordinatorspeculativeHit1> arrayList = nodeCoordinatorKt.IconCompatParcelizer;
        accessnextUntilhw7D004 accessnextuntilhw7d004 = nodeCoordinatorKt.serializer;
        for (NodeCoordinatorspeculativeHit1 nodeCoordinatorspeculativeHit1 : arrayList) {
            NodeKindKt nodeKindKt = nodeCoordinatorspeculativeHit1.serializer;
            childHitTestqzLsGqo childhittestqzlsgqo = nodeCoordinatorspeculativeHit1.write;
            if (nodeKindKt instanceof ServerTimestampOperation) {
                dispatchHoverEventui dispatchhovereventuiNewBuilder = DocumentTransform.FieldTransform.newBuilder();
                String strWrite2 = childhittestqzlsgqo.write();
                dispatchhovereventuiNewBuilder.RemoteActionCompatParcelizer();
                ((DocumentTransform.FieldTransform) dispatchhovereventuiNewBuilder.RemoteActionCompatParcelizer).setFieldPath(strWrite2);
                DocumentTransform.FieldTransform.serializer serializerVar = DocumentTransform.FieldTransform.serializer.REQUEST_TIME;
                dispatchhovereventuiNewBuilder.RemoteActionCompatParcelizer();
                ((DocumentTransform.FieldTransform) dispatchhovereventuiNewBuilder.RemoteActionCompatParcelizer).setSetToServerValue(serializerVar);
                generatedMessageLiteSerializer = dispatchhovereventuiNewBuilder.serializer();
            } else if (nodeKindKt instanceof NodeCoordinatordrawBlock1) {
                dispatchHoverEventui dispatchhovereventuiNewBuilder2 = DocumentTransform.FieldTransform.newBuilder();
                String strWrite3 = childhittestqzlsgqo.write();
                dispatchhovereventuiNewBuilder2.RemoteActionCompatParcelizer();
                ((DocumentTransform.FieldTransform) dispatchhovereventuiNewBuilder2.RemoteActionCompatParcelizer).setFieldPath(strWrite3);
                performActionHelper performactionhelperNewBuilder = ArrayValue.newBuilder();
                List list = ((NodeCoordinatordrawBlock1) nodeKindKt).RemoteActionCompatParcelizer;
                performactionhelperNewBuilder.RemoteActionCompatParcelizer();
                ((ArrayValue) performactionhelperNewBuilder.RemoteActionCompatParcelizer).addAllValues(list);
                dispatchhovereventuiNewBuilder2.RemoteActionCompatParcelizer();
                ((DocumentTransform.FieldTransform) dispatchhovereventuiNewBuilder2.RemoteActionCompatParcelizer).setAppendMissingElements((ArrayValue) performactionhelperNewBuilder.serializer());
                generatedMessageLiteSerializer = dispatchhovereventuiNewBuilder2.serializer();
            } else if (nodeKindKt instanceof NodeCoordinatorCompaniononCommitAffectingLayerParams1) {
                dispatchHoverEventui dispatchhovereventuiNewBuilder3 = DocumentTransform.FieldTransform.newBuilder();
                String strWrite4 = childhittestqzlsgqo.write();
                dispatchhovereventuiNewBuilder3.RemoteActionCompatParcelizer();
                ((DocumentTransform.FieldTransform) dispatchhovereventuiNewBuilder3.RemoteActionCompatParcelizer).setFieldPath(strWrite4);
                performActionHelper performactionhelperNewBuilder2 = ArrayValue.newBuilder();
                List list2 = ((NodeCoordinatorCompaniononCommitAffectingLayerParams1) nodeKindKt).RemoteActionCompatParcelizer;
                performactionhelperNewBuilder2.RemoteActionCompatParcelizer();
                ((ArrayValue) performactionhelperNewBuilder2.RemoteActionCompatParcelizer).addAllValues(list2);
                dispatchhovereventuiNewBuilder3.RemoteActionCompatParcelizer();
                ((DocumentTransform.FieldTransform) dispatchhovereventuiNewBuilder3.RemoteActionCompatParcelizer).setRemoveAllFromArray((ArrayValue) performactionhelperNewBuilder2.serializer());
                generatedMessageLiteSerializer = dispatchhovereventuiNewBuilder3.serializer();
            } else {
                if (!(nodeKindKt instanceof NodeKind)) {
                    getRectManager.write("Unknown transform: %s", nodeKindKt);
                    throw null;
                }
                dispatchHoverEventui dispatchhovereventuiNewBuilder4 = DocumentTransform.FieldTransform.newBuilder();
                String strWrite5 = childhittestqzlsgqo.write();
                dispatchhovereventuiNewBuilder4.RemoteActionCompatParcelizer();
                ((DocumentTransform.FieldTransform) dispatchhovereventuiNewBuilder4.RemoteActionCompatParcelizer).setFieldPath(strWrite5);
                Value value = ((NodeKind) nodeKindKt).IconCompatParcelizer;
                dispatchhovereventuiNewBuilder4.RemoteActionCompatParcelizer();
                ((DocumentTransform.FieldTransform) dispatchhovereventuiNewBuilder4.RemoteActionCompatParcelizer).setIncrement(value);
                generatedMessageLiteSerializer = dispatchhovereventuiNewBuilder4.serializer();
            }
            diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer();
            ((Write) diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer).addUpdateTransforms((DocumentTransform.FieldTransform) generatedMessageLiteSerializer);
        }
        SnapshotVersion snapshotVersion = accessnextuntilhw7d004.write;
        Boolean bool = accessnextuntilhw7d004.read;
        if (snapshotVersion != null || bool != null) {
            getRectManager.RemoteActionCompatParcelizer(!(snapshotVersion == null && bool == null), "Can't serialize an empty precondition", new Object[0]);
            AndroidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1 androidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1NewBuilder = Precondition.newBuilder();
            SnapshotVersion snapshotVersion2 = accessnextuntilhw7d004.write;
            if (snapshotVersion2 != null) {
                Timestamp timestampWrite = write(snapshotVersion2.read);
                androidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1NewBuilder.RemoteActionCompatParcelizer();
                ((Precondition) androidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1NewBuilder.RemoteActionCompatParcelizer).setUpdateTime(timestampWrite);
                precondition = (Precondition) androidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1NewBuilder.serializer();
            } else {
                if (bool == null) {
                    getRectManager.write("Unknown Precondition", new Object[0]);
                    throw null;
                }
                boolean zBooleanValue = bool.booleanValue();
                androidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1NewBuilder.RemoteActionCompatParcelizer();
                ((Precondition) androidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1NewBuilder.RemoteActionCompatParcelizer).setExists(zBooleanValue);
                precondition = (Precondition) androidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1NewBuilder.serializer();
            }
            diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer();
            ((Write) diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer).setCurrentDocument(precondition);
        }
        return (Write) diffforwindowmetricschangedNewBuilder.serializer();
    }

    public final Target.QueryTarget serializer(fromParentRect fromparentrect) {
        onShowTranslation onshowtranslationNewBuilder = Target.QueryTarget.newBuilder();
        getDisableContentCapture getdisablecontentcaptureNewBuilder = StructuredQuery.newBuilder();
        shareWithSiblings sharewithsiblings = fromparentrect.MediaSessionCompatQueueItem;
        long j = fromparentrect.serializer;
        List list = fromparentrect.read;
        setBefore setbefore = fromparentrect.IconCompatParcelizer;
        setBefore setbefore2 = fromparentrect.MediaBrowserCompatMediaItem;
        String str = fromparentrect.write;
        visitNodesaLcG6gQ visitnodesalcg6gq = this.IconCompatParcelizer;
        if (str != null) {
            getRectManager.RemoteActionCompatParcelizer(sharewithsiblings.IconCompatParcelizer.size() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            String str2 = read(visitnodesalcg6gq, sharewithsiblings);
            onshowtranslationNewBuilder.RemoteActionCompatParcelizer();
            ((Target.QueryTarget) onshowtranslationNewBuilder.RemoteActionCompatParcelizer).setParent(str2);
            excludeLineAndPageGranularities excludelineandpagegranularitiesNewBuilder = StructuredQuery.CollectionSelector.newBuilder();
            excludelineandpagegranularitiesNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery.CollectionSelector) excludelineandpagegranularitiesNewBuilder.RemoteActionCompatParcelizer).setCollectionId(str);
            excludelineandpagegranularitiesNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery.CollectionSelector) excludelineandpagegranularitiesNewBuilder.RemoteActionCompatParcelizer).setAllDescendants(true);
            getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery) getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer).addFrom((StructuredQuery.CollectionSelector) excludelineandpagegranularitiesNewBuilder.serializer());
        } else {
            getRectManager.RemoteActionCompatParcelizer(sharewithsiblings.IconCompatParcelizer.size() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            String str3 = read(visitnodesalcg6gq, (shareWithSiblings) sharewithsiblings.RemoteActionCompatParcelizer());
            onshowtranslationNewBuilder.RemoteActionCompatParcelizer();
            ((Target.QueryTarget) onshowtranslationNewBuilder.RemoteActionCompatParcelizer).setParent(str3);
            excludeLineAndPageGranularities excludelineandpagegranularitiesNewBuilder2 = StructuredQuery.CollectionSelector.newBuilder();
            String strSerializer = sharewithsiblings.serializer();
            excludelineandpagegranularitiesNewBuilder2.RemoteActionCompatParcelizer();
            ((StructuredQuery.CollectionSelector) excludelineandpagegranularitiesNewBuilder2.RemoteActionCompatParcelizer).setCollectionId(strSerializer);
            getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery) getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer).addFrom((StructuredQuery.CollectionSelector) excludelineandpagegranularitiesNewBuilder2.serializer());
        }
        if (list.size() > 0) {
            StructuredQuery.Filter filterWrite = write(new setShouldAttachOnInsert(list, linearDiffAborted.AND));
            getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery) getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer).setWhere(filterWrite);
        }
        for (accessgetSnapshotObserver accessgetsnapshotobserver : fromparentrect.MediaMetadataCompat) {
            AndroidComposeViewForceDarkModeQ androidComposeViewForceDarkModeQNewBuilder = StructuredQuery.Order.newBuilder();
            if (accessgetsnapshotobserver.write.equals(accessgetOnCommitAffectingLayercp.ASCENDING)) {
                StructuredQuery.IconCompatParcelizer iconCompatParcelizer = StructuredQuery.IconCompatParcelizer.ASCENDING;
                androidComposeViewForceDarkModeQNewBuilder.RemoteActionCompatParcelizer();
                ((StructuredQuery.Order) androidComposeViewForceDarkModeQNewBuilder.RemoteActionCompatParcelizer).setDirection(iconCompatParcelizer);
            } else {
                StructuredQuery.IconCompatParcelizer iconCompatParcelizer2 = StructuredQuery.IconCompatParcelizer.DESCENDING;
                androidComposeViewForceDarkModeQNewBuilder.RemoteActionCompatParcelizer();
                ((StructuredQuery.Order) androidComposeViewForceDarkModeQNewBuilder.RemoteActionCompatParcelizer).setDirection(iconCompatParcelizer2);
            }
            childHitTestqzLsGqo childhittestqzlsgqo = accessgetsnapshotobserver.RemoteActionCompatParcelizer;
            isScreenReaderFocusable isscreenreaderfocusableNewBuilder = StructuredQuery.FieldReference.newBuilder();
            String strWrite = childhittestqzlsgqo.write();
            isscreenreaderfocusableNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery.FieldReference) isscreenreaderfocusableNewBuilder.RemoteActionCompatParcelizer).setFieldPath(strWrite);
            StructuredQuery.FieldReference fieldReference = (StructuredQuery.FieldReference) isscreenreaderfocusableNewBuilder.serializer();
            androidComposeViewForceDarkModeQNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery.Order) androidComposeViewForceDarkModeQNewBuilder.RemoteActionCompatParcelizer).setField(fieldReference);
            StructuredQuery.Order order = (StructuredQuery.Order) androidComposeViewForceDarkModeQNewBuilder.serializer();
            getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery) getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer).addOrderBy(order);
        }
        if (j != -1) {
            CompositionLocalsKtLocalUriHandler1 compositionLocalsKtLocalUriHandler1NewBuilder = Int32Value.newBuilder();
            compositionLocalsKtLocalUriHandler1NewBuilder.RemoteActionCompatParcelizer();
            ((Int32Value) compositionLocalsKtLocalUriHandler1NewBuilder.RemoteActionCompatParcelizer).setValue((int) j);
            getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery) getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer).setLimit((Int32Value) compositionLocalsKtLocalUriHandler1NewBuilder.serializer());
        }
        if (setbefore2 != null) {
            sendTypeViewScrolledAccessibilityEvent sendtypeviewscrolledaccessibilityeventNewBuilder = Cursor.newBuilder();
            List list2 = setbefore2.write;
            sendtypeviewscrolledaccessibilityeventNewBuilder.RemoteActionCompatParcelizer();
            ((Cursor) sendtypeviewscrolledaccessibilityeventNewBuilder.RemoteActionCompatParcelizer).addAllValues(list2);
            boolean z = setbefore2.RemoteActionCompatParcelizer;
            sendtypeviewscrolledaccessibilityeventNewBuilder.RemoteActionCompatParcelizer();
            ((Cursor) sendtypeviewscrolledaccessibilityeventNewBuilder.RemoteActionCompatParcelizer).setBefore(z);
            getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery) getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer).setStartAt((Cursor) sendtypeviewscrolledaccessibilityeventNewBuilder.serializer());
        }
        if (setbefore != null) {
            sendTypeViewScrolledAccessibilityEvent sendtypeviewscrolledaccessibilityeventNewBuilder2 = Cursor.newBuilder();
            List list3 = setbefore.write;
            sendtypeviewscrolledaccessibilityeventNewBuilder2.RemoteActionCompatParcelizer();
            ((Cursor) sendtypeviewscrolledaccessibilityeventNewBuilder2.RemoteActionCompatParcelizer).addAllValues(list3);
            boolean z2 = setbefore.RemoteActionCompatParcelizer;
            sendtypeviewscrolledaccessibilityeventNewBuilder2.RemoteActionCompatParcelizer();
            ((Cursor) sendtypeviewscrolledaccessibilityeventNewBuilder2.RemoteActionCompatParcelizer).setBefore(!z2);
            getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery) getdisablecontentcaptureNewBuilder.RemoteActionCompatParcelizer).setEndAt((Cursor) sendtypeviewscrolledaccessibilityeventNewBuilder2.serializer());
        }
        onshowtranslationNewBuilder.RemoteActionCompatParcelizer();
        ((Target.QueryTarget) onshowtranslationNewBuilder.RemoteActionCompatParcelizer).setStructuredQuery((StructuredQuery) getdisablecontentcaptureNewBuilder.serializer());
        return (Target.QueryTarget) onshowtranslationNewBuilder.serializer();
    }

    public static StructuredQuery.Filter write(fillVector fillvector) {
        StructuredQuery.CompositeFilter.read readVar;
        StructuredQuery.FieldFilter.read readVar2;
        if (!(fillvector instanceof nodeReused)) {
            if (!(fillvector instanceof setShouldAttachOnInsert)) {
                getRectManager.write("Unrecognized filter type %s", fillvector.toString());
                throw null;
            }
            setShouldAttachOnInsert setshouldattachoninsert = (setShouldAttachOnInsert) fillvector;
            ArrayList arrayList = setshouldattachoninsert.read;
            ArrayList arrayList2 = new ArrayList(Collections.unmodifiableList(arrayList).size());
            Iterator it = Collections.unmodifiableList(arrayList).iterator();
            while (it.hasNext()) {
                arrayList2.add(write((fillVector) it.next()));
            }
            if (arrayList2.size() == 1) {
                return (StructuredQuery.Filter) arrayList2.get(0);
            }
            getDisableContentCaptureannotations getdisablecontentcaptureannotationsNewBuilder = StructuredQuery.CompositeFilter.newBuilder();
            int i = onRequestMeasuredefault.RemoteActionCompatParcelizer[setshouldattachoninsert.serializer.ordinal()];
            if (i == 1) {
                readVar = StructuredQuery.CompositeFilter.read.AND;
            } else {
                if (i != 2) {
                    getRectManager.write("Unrecognized composite filter type.", new Object[0]);
                    throw null;
                }
                readVar = StructuredQuery.CompositeFilter.read.OR;
            }
            getdisablecontentcaptureannotationsNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery.CompositeFilter) getdisablecontentcaptureannotationsNewBuilder.RemoteActionCompatParcelizer).setOp(readVar);
            getdisablecontentcaptureannotationsNewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery.CompositeFilter) getdisablecontentcaptureannotationsNewBuilder.RemoteActionCompatParcelizer).addAllFilters(arrayList2);
            AndroidComposeViewAssistHelperMethodsO androidComposeViewAssistHelperMethodsONewBuilder = StructuredQuery.Filter.newBuilder();
            androidComposeViewAssistHelperMethodsONewBuilder.RemoteActionCompatParcelizer();
            ((StructuredQuery.Filter) androidComposeViewAssistHelperMethodsONewBuilder.RemoteActionCompatParcelizer).setCompositeFilter((StructuredQuery.CompositeFilter) getdisablecontentcaptureannotationsNewBuilder.serializer());
            return (StructuredQuery.Filter) androidComposeViewAssistHelperMethodsONewBuilder.serializer();
        }
        nodeReused nodereused = (nodeReused) fillvector;
        updateUnsafe updateunsafe = nodereused.read;
        Value value = nodereused.RemoteActionCompatParcelizer;
        childHitTestqzLsGqo childhittestqzlsgqo = nodereused.serializer;
        isScreenReaderFocusable isscreenreaderfocusableNewBuilder = StructuredQuery.FieldReference.newBuilder();
        String strWrite = childhittestqzlsgqo.write();
        isscreenreaderfocusableNewBuilder.RemoteActionCompatParcelizer();
        ((StructuredQuery.FieldReference) isscreenreaderfocusableNewBuilder.RemoteActionCompatParcelizer).setFieldPath(strWrite);
        StructuredQuery.FieldReference fieldReference = (StructuredQuery.FieldReference) isscreenreaderfocusableNewBuilder.serializer();
        if (updateunsafe == updateUnsafe.EQUAL) {
            NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
            if (value != null && Double.isNaN(value.getDoubleValue())) {
                return RemoteActionCompatParcelizer(fieldReference, StructuredQuery.UnaryFilter.write.IS_NAN);
            }
            if (value != null && value.hasNullValue()) {
                return RemoteActionCompatParcelizer(fieldReference, StructuredQuery.UnaryFilter.write.IS_NULL);
            }
        } else if (updateunsafe == updateUnsafe.NOT_EQUAL) {
            NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer2 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
            if (value != null && Double.isNaN(value.getDoubleValue())) {
                return RemoteActionCompatParcelizer(fieldReference, StructuredQuery.UnaryFilter.write.IS_NOT_NAN);
            }
            if (value != null && value.hasNullValue()) {
                return RemoteActionCompatParcelizer(fieldReference, StructuredQuery.UnaryFilter.write.IS_NOT_NULL);
            }
        }
        AndroidComposeViewAccessibilityDelegateCompat_androidKtWhenMappings androidComposeViewAccessibilityDelegateCompat_androidKtWhenMappingsNewBuilder = StructuredQuery.FieldFilter.newBuilder();
        androidComposeViewAccessibilityDelegateCompat_androidKtWhenMappingsNewBuilder.RemoteActionCompatParcelizer();
        ((StructuredQuery.FieldFilter) androidComposeViewAccessibilityDelegateCompat_androidKtWhenMappingsNewBuilder.RemoteActionCompatParcelizer).setField(fieldReference);
        switch (onRequestMeasuredefault.serializer[updateunsafe.ordinal()]) {
            case 1:
                readVar2 = StructuredQuery.FieldFilter.read.LESS_THAN;
                break;
            case 2:
                readVar2 = StructuredQuery.FieldFilter.read.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                readVar2 = StructuredQuery.FieldFilter.read.EQUAL;
                break;
            case 4:
                readVar2 = StructuredQuery.FieldFilter.read.NOT_EQUAL;
                break;
            case 5:
                readVar2 = StructuredQuery.FieldFilter.read.GREATER_THAN;
                break;
            case 6:
                readVar2 = StructuredQuery.FieldFilter.read.GREATER_THAN_OR_EQUAL;
                break;
            case 7:
                readVar2 = StructuredQuery.FieldFilter.read.ARRAY_CONTAINS;
                break;
            case 8:
                readVar2 = StructuredQuery.FieldFilter.read.IN;
                break;
            case 9:
                readVar2 = StructuredQuery.FieldFilter.read.ARRAY_CONTAINS_ANY;
                break;
            case 10:
                readVar2 = StructuredQuery.FieldFilter.read.NOT_IN;
                break;
            default:
                getRectManager.write("Unknown operator %d", updateunsafe);
                throw null;
        }
        androidComposeViewAccessibilityDelegateCompat_androidKtWhenMappingsNewBuilder.RemoteActionCompatParcelizer();
        ((StructuredQuery.FieldFilter) androidComposeViewAccessibilityDelegateCompat_androidKtWhenMappingsNewBuilder.RemoteActionCompatParcelizer).setOp(readVar2);
        androidComposeViewAccessibilityDelegateCompat_androidKtWhenMappingsNewBuilder.RemoteActionCompatParcelizer();
        ((StructuredQuery.FieldFilter) androidComposeViewAccessibilityDelegateCompat_androidKtWhenMappingsNewBuilder.RemoteActionCompatParcelizer).setValue(value);
        AndroidComposeViewAssistHelperMethodsO androidComposeViewAssistHelperMethodsONewBuilder2 = StructuredQuery.Filter.newBuilder();
        androidComposeViewAssistHelperMethodsONewBuilder2.RemoteActionCompatParcelizer();
        ((StructuredQuery.Filter) androidComposeViewAssistHelperMethodsONewBuilder2.RemoteActionCompatParcelizer).setFieldFilter((StructuredQuery.FieldFilter) androidComposeViewAccessibilityDelegateCompat_androidKtWhenMappingsNewBuilder.serializer());
        return (StructuredQuery.Filter) androidComposeViewAssistHelperMethodsONewBuilder2.serializer();
    }

    public final visitNodes IconCompatParcelizer(String str) {
        shareWithSiblings sharewithsiblings = read(str);
        String strRemoteActionCompatParcelizer = sharewithsiblings.RemoteActionCompatParcelizer(1);
        visitNodesaLcG6gQ visitnodesalcg6gq = this.IconCompatParcelizer;
        getRectManager.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer.equals(visitnodesalcg6gq.write), "Tried to deserialize key from different project.", new Object[0]);
        getRectManager.RemoteActionCompatParcelizer(sharewithsiblings.RemoteActionCompatParcelizer(3).equals(visitnodesalcg6gq.serializer), "Tried to deserialize key from different database.", new Object[0]);
        return new visitNodes(IconCompatParcelizer(sharewithsiblings));
    }

    public static String read(visitNodesaLcG6gQ visitnodesalcg6gq, shareWithSiblings sharewithsiblings) {
        shareWithSiblings sharewithsiblings2 = (shareWithSiblings) write(visitnodesalcg6gq).write("documents");
        ArrayList arrayList = new ArrayList(sharewithsiblings2.IconCompatParcelizer);
        arrayList.addAll(sharewithsiblings.IconCompatParcelizer);
        return ((shareWithSiblings) sharewithsiblings2.serializer(arrayList)).write();
    }

    public static SnapshotVersion write(Timestamp timestamp) {
        return (timestamp.getSeconds() == 0 && timestamp.getNanos() == 0) ? SnapshotVersion.IconCompatParcelizer : new SnapshotVersion(new com.google.firebase.Timestamp(timestamp.getSeconds(), timestamp.getNanos()));
    }
}
