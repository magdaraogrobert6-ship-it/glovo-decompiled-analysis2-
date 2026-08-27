package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.pipeline.DocumentsSource;
import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.proto.NoDocument;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.proto.UnknownDocument;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firestore.admin.v1.Index;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentTransform;
import com.google.firestore.v1.Pipeline;
import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.Value;
import com.google.firestore.v1.Write;
import com.google.protobuf.Timestamp;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getForceMeasureWithLookaheadConstraintsui {
    public final RemoteSerializer IconCompatParcelizer;

    public static ArrayList RemoteActionCompatParcelizer(Index index) {
        ArrayList arrayList = new ArrayList();
        for (Index.IndexField indexField : index.getFieldsList()) {
            arrayList.add(new shouldSharePointerInputWithSiblings(childHitTestqzLsGqo.read(indexField.getFieldPath()), indexField.getValueModeCase().equals(Index.IndexField.write.ARRAY_CONFIG) ? NodeCoordinatorCompanion.CONTAINS : indexField.getOrder().equals(Index.IndexField.RemoteActionCompatParcelizer.ASCENDING) ? NodeCoordinatorCompanion.ASCENDING : NodeCoordinatorCompanion.DESCENDING));
        }
        return arrayList;
    }

    public final NodeCoordinatorCompanionPointerInputSource1 RemoteActionCompatParcelizer(MaybeDocument maybeDocument) {
        int i = fromParentPosition8S9VItk.serializer[maybeDocument.getDocumentTypeCase().ordinal()];
        RemoteSerializer remoteSerializer = this.IconCompatParcelizer;
        if (i == 1) {
            Document document = maybeDocument.getDocument();
            boolean hasCommittedMutations = maybeDocument.getHasCommittedMutations();
            visitNodes visitnodesIconCompatParcelizer = remoteSerializer.IconCompatParcelizer(document.getName());
            SnapshotVersion snapshotVersionWrite = RemoteSerializer.write(document.getUpdateTime());
            entityTypeOLwlOKw entitytypeolwlokw = new entityTypeOLwlOKw(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(document.getFieldsMap()));
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = new NodeCoordinatorCompanionPointerInputSource1(visitnodesIconCompatParcelizer);
            nodeCoordinatorCompanionPointerInputSource1.serializer(snapshotVersionWrite, entitytypeolwlokw);
            if (hasCommittedMutations) {
                nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer = getPointerInputSource.HAS_COMMITTED_MUTATIONS;
            }
            return nodeCoordinatorCompanionPointerInputSource1;
        }
        if (i == 2) {
            NoDocument noDocument = maybeDocument.getNoDocument();
            boolean hasCommittedMutations2 = maybeDocument.getHasCommittedMutations();
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1Write = NodeCoordinatorCompanionPointerInputSource1.write(remoteSerializer.IconCompatParcelizer(noDocument.getName()), RemoteSerializer.write(noDocument.getReadTime()));
            if (hasCommittedMutations2) {
                nodeCoordinatorCompanionPointerInputSource1Write.RemoteActionCompatParcelizer = getPointerInputSource.HAS_COMMITTED_MUTATIONS;
            }
            return nodeCoordinatorCompanionPointerInputSource1Write;
        }
        if (i != 3) {
            getRectManager.write("Unknown MaybeDocument %s", maybeDocument);
            throw null;
        }
        UnknownDocument unknownDocument = maybeDocument.getUnknownDocument();
        visitNodes visitnodesIconCompatParcelizer2 = remoteSerializer.IconCompatParcelizer(unknownDocument.getName());
        SnapshotVersion snapshotVersionWrite2 = RemoteSerializer.write(unknownDocument.getVersion());
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = new NodeCoordinatorCompanionPointerInputSource1(visitnodesIconCompatParcelizer2);
        nodeCoordinatorCompanionPointerInputSource2.MediaDescriptionCompat = snapshotVersionWrite2;
        nodeCoordinatorCompanionPointerInputSource2.serializer = getSemanticsSource.UNKNOWN_DOCUMENT;
        nodeCoordinatorCompanionPointerInputSource2.write = new entityTypeOLwlOKw();
        nodeCoordinatorCompanionPointerInputSource2.RemoteActionCompatParcelizer = getPointerInputSource.HAS_COMMITTED_MUTATIONS;
        return nodeCoordinatorCompanionPointerInputSource2;
    }

    public getForceMeasureWithLookaheadConstraintsui(RemoteSerializer remoteSerializer) {
        this.IconCompatParcelizer = remoteSerializer;
    }

    public final NodeCoordinatorupdateLayerParameters1 read(WriteBatch writeBatch) {
        RemoteSerializer remoteSerializer;
        int batchId = writeBatch.getBatchId();
        Timestamp localWriteTime = writeBatch.getLocalWriteTime();
        com.google.firebase.Timestamp timestamp = new com.google.firebase.Timestamp(localWriteTime.getSeconds(), localWriteTime.getNanos());
        int baseWritesCount = writeBatch.getBaseWritesCount();
        ArrayList arrayList = new ArrayList(baseWritesCount);
        int i = 0;
        while (true) {
            remoteSerializer = this.IconCompatParcelizer;
            if (i >= baseWritesCount) {
                break;
            }
            arrayList.add(remoteSerializer.RemoteActionCompatParcelizer(writeBatch.getBaseWrites(i)));
            i++;
        }
        ArrayList arrayList2 = new ArrayList(writeBatch.getWritesCount());
        int i2 = 0;
        while (i2 < writeBatch.getWritesCount()) {
            Write writes = writeBatch.getWrites(i2);
            int i3 = i2 + 1;
            if (i3 >= writeBatch.getWritesCount() || !writeBatch.getWrites(i3).hasTransform()) {
                arrayList2.add(remoteSerializer.RemoteActionCompatParcelizer(writes));
            } else {
                getRectManager.RemoteActionCompatParcelizer(writeBatch.getWrites(i2).hasUpdate(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                diffForWindowMetricsChanged diffforwindowmetricschangedNewBuilder = Write.newBuilder(writes);
                for (DocumentTransform.FieldTransform fieldTransform : writeBatch.getWrites(i3).getTransform().getFieldTransformsList()) {
                    diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer();
                    ((Write) diffforwindowmetricschangedNewBuilder.RemoteActionCompatParcelizer).addUpdateTransforms(fieldTransform);
                }
                arrayList2.add(remoteSerializer.RemoteActionCompatParcelizer((Write) diffforwindowmetricschangedNewBuilder.serializer()));
                i2 = i3;
            }
            i2++;
        }
        return new NodeCoordinatorupdateLayerParameters1(batchId, timestamp, arrayList, arrayList2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v84 */
    public final setLastShapeui write(Target target) {
        hitNearFh5PU_I getsnapshotobserver;
        shareWithSiblings sharewithsiblings;
        String collectionId;
        List listSingletonList;
        setBefore setbefore;
        List list;
        accessgetOnCommitAffectingLayercp accessgetoncommitaffectinglayercp;
        ?? r1;
        Iterator<Pipeline.Stage> it;
        char c;
        Object orimplVar;
        getInsertedannotations getinsertedannotations;
        Object getremovedannotations;
        int targetId = target.getTargetId();
        SnapshotVersion snapshotVersionWrite = RemoteSerializer.write(target.getSnapshotVersion());
        SnapshotVersion snapshotVersionWrite2 = RemoteSerializer.write(target.getLastLimboFreeSnapshotVersion());
        getClipMetadata resumeToken = target.getResumeToken();
        long lastListenSequenceNumber = target.getLastListenSequenceNumber();
        int i = fromParentPosition8S9VItk.read[target.getTargetTypeCase().ordinal()];
        boolean z = true;
        if (i != 1) {
            char c2 = 2;
            if (i != 2) {
                char c3 = 3;
                if (i != 3) {
                    getRectManager.write("Unknown targetType %d", target.getTargetTypeCase());
                    throw null;
                }
                com.google.firestore.v1.Target.PipelineQueryTarget pipelineQuery = target.getPipelineQuery();
                getRectManager.RemoteActionCompatParcelizer(pipelineQuery.getPipelineTypeCase() == com.google.firestore.v1.Target.PipelineQueryTarget.read.STRUCTURED_PIPELINE, "Unknown pipeline_type in PipelineQueryTarget: " + pipelineQuery.getPipelineTypeCase(), new Object[0]);
                Pipeline pipeline = pipelineQuery.getStructuredPipeline().getPipeline();
                ArrayList arrayList = new ArrayList();
                Iterator<Pipeline.Stage> it2 = pipeline.getStagesList().iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    RemoteSerializer remoteSerializer = this.IconCompatParcelizer;
                    if (zHasNext) {
                        Pipeline.Stage next = it2.next();
                        String name = next.getName();
                        List<Value> argsList = next.getArgsList();
                        name.getClass();
                        switch (name) {
                            case "collection":
                                r1 = 0;
                                break;
                            case "collection_group":
                                r1 = z;
                                break;
                            case "sort":
                                r1 = c2;
                                break;
                            case "limit":
                                r1 = c3;
                                break;
                            case "where":
                                r1 = 4;
                                break;
                            case "documents":
                                r1 = 5;
                                break;
                            default:
                                r1 = -1;
                                break;
                        }
                        getIncludeSelfInTraversalH91voCI getincludeselfintraversalh91voci = getIncludeSelfInTraversalH91voCI.read;
                        if (r1 != 0) {
                            if (r1 == z) {
                                it = it2;
                                getRectManager.RemoteActionCompatParcelizer(argsList.size() >= 1 && argsList.get(0).getValueTypeCase() == Value.RemoteActionCompatParcelizer.STRING_VALUE, "Invalid 'collection_group' stage: missing or invalid arguments", new Object[0]);
                                orimplVar = new getMask(argsList.get(0).getStringValue(), getincludeselfintraversalh91voci);
                            } else if (r1 != c2) {
                                if (r1 == 3) {
                                    getRectManager.RemoteActionCompatParcelizer(argsList.size() >= 1 && argsList.get(0).getValueTypeCase() == Value.RemoteActionCompatParcelizer.INTEGER_VALUE, "Invalid 'limit' stage: missing or invalid arguments", new Object[0]);
                                    getremovedannotations = new getRemovedannotations((int) argsList.get(0).getIntegerValue(), getincludeselfintraversalh91voci);
                                } else if (r1 == 4) {
                                    getRectManager.RemoteActionCompatParcelizer(argsList.size() >= 1, "Invalid 'where' stage: missing or invalid arguments", new Object[0]);
                                    getremovedannotations = new maxHeightui(RemoteSerializer.write(argsList.get(0)), getincludeselfintraversalh91voci);
                                } else {
                                    if (r1 != 5) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported stage type: ".concat(name));
                                        return null;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Value value : argsList) {
                                        getRectManager.RemoteActionCompatParcelizer(value.getValueTypeCase() == Value.RemoteActionCompatParcelizer.REFERENCE_VALUE ? z : false, "Invalid argument type for 'documents' stage: expected reference_value", new Object[0]);
                                        arrayList2.add(shareWithSiblings.IconCompatParcelizer(value.getReferenceValue()));
                                        z = true;
                                    }
                                    orimplVar = new DocumentsSource((shareWithSiblings[]) arrayList2.toArray(new shareWithSiblings[0]), getincludeselfintraversalh91voci);
                                    it = it2;
                                }
                                it = it2;
                                orimplVar = getremovedannotations;
                            } else {
                                getRectManager.RemoteActionCompatParcelizer(argsList.size() > 0, "Invalid 'sort' stage: missing arguments", new Object[0]);
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<Value> it3 = argsList.iterator();
                                while (it3.hasNext()) {
                                    Value next2 = it3.next();
                                    getRectManager.RemoteActionCompatParcelizer(next2.getValueTypeCase() == Value.RemoteActionCompatParcelizer.MAP_VALUE, "Invalid proto_value type for Ordering, expected map_value.", new Object[0]);
                                    autoInvalidateInsertedNode autoinvalidateinsertednodeWrite = null;
                                    getInsertedannotations getinsertedannotations2 = null;
                                    for (Map.Entry<String, Value> entry : next2.getMapValue().getFieldsMap().entrySet()) {
                                        Iterator<Pipeline.Stage> it4 = it2;
                                        String key = entry.getKey();
                                        Value value2 = entry.getValue();
                                        Iterator<Value> it5 = it3;
                                        if (key.equals("expression")) {
                                            getRectManager.RemoteActionCompatParcelizer(autoinvalidateinsertednodeWrite == null, "Duplicate 'expression' field in Ordering proto.", new Object[0]);
                                            autoinvalidateinsertednodeWrite = RemoteSerializer.write(value2);
                                        } else if (key.equals(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)) {
                                            getRectManager.RemoteActionCompatParcelizer(getinsertedannotations2 == null, "Duplicate 'direction' field in Ordering proto.", new Object[0]);
                                            getRectManager.RemoteActionCompatParcelizer(value2.getValueTypeCase() == Value.RemoteActionCompatParcelizer.STRING_VALUE, "Invalid type for 'direction' field in Ordering proto, expected string_value.", new Object[0]);
                                            String stringValue = value2.getStringValue();
                                            if (stringValue.equals("ascending")) {
                                                getinsertedannotations = getInsertedannotations.ASCENDING;
                                            } else {
                                                if (!stringValue.equals("descending")) {
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Invalid string value '", stringValue, "' for 'direction' field in Ordering proto."));
                                                    return null;
                                                }
                                                getinsertedannotations = getInsertedannotations.DESCENDING;
                                            }
                                            getinsertedannotations2 = getinsertedannotations;
                                        } else {
                                            continue;
                                        }
                                        it2 = it4;
                                        it3 = it5;
                                    }
                                    Iterator<Pipeline.Stage> it6 = it2;
                                    Iterator<Value> it7 = it3;
                                    getRectManager.RemoteActionCompatParcelizer(autoinvalidateinsertednodeWrite != null, "Missing 'expression' field in Ordering proto.", new Object[0]);
                                    getRectManager.RemoteActionCompatParcelizer(getinsertedannotations2 != null, "Missing 'direction' field in Ordering proto.", new Object[0]);
                                    arrayList3.add(new contains64DMado(autoinvalidateinsertednodeWrite, getinsertedannotations2));
                                    it2 = it6;
                                    it3 = it7;
                                }
                                it = it2;
                                orimplVar = new or64DMado((contains64DMado[]) arrayList3.toArray(new contains64DMado[0]), getincludeselfintraversalh91voci);
                            }
                            c = 3;
                        } else {
                            it = it2;
                            c = 3;
                            getRectManager.RemoteActionCompatParcelizer(argsList.size() >= 1 && argsList.get(0).getValueTypeCase() == Value.RemoteActionCompatParcelizer.REFERENCE_VALUE, "Invalid 'collection' stage: missing or invalid arguments", new Object[0]);
                            orimplVar = new orimpl(shareWithSiblings.IconCompatParcelizer(argsList.get(0).getReferenceValue()), remoteSerializer, getincludeselfintraversalh91voci);
                        }
                        arrayList.add(orimplVar);
                        c3 = c;
                        z = true;
                        c2 = 2;
                        it2 = it;
                    } else {
                        getsnapshotobserver = new hasNodeH91voCI(new tailH91voCIui(remoteSerializer, new toContentCaptureSession(25), arrayList, null));
                    }
                }
            } else {
                com.google.firestore.v1.Target.QueryTarget query = target.getQuery();
                String parent = query.getParent();
                StructuredQuery structuredQuery = query.getStructuredQuery();
                shareWithSiblings sharewithsiblings2 = RemoteSerializer.read(parent);
                shareWithSiblings sharewithsiblingsIconCompatParcelizer = sharewithsiblings2.IconCompatParcelizer.size() == 4 ? shareWithSiblings.serializer : RemoteSerializer.IconCompatParcelizer(sharewithsiblings2);
                int fromCount = structuredQuery.getFromCount();
                if (fromCount <= 0) {
                    sharewithsiblings = sharewithsiblingsIconCompatParcelizer;
                    collectionId = null;
                } else {
                    getRectManager.RemoteActionCompatParcelizer(fromCount == 1, "StructuredQuery.from with more than one collection is not supported.", new Object[0]);
                    StructuredQuery.CollectionSelector from = structuredQuery.getFrom(0);
                    if (from.getAllDescendants()) {
                        sharewithsiblings = sharewithsiblingsIconCompatParcelizer;
                        collectionId = from.getCollectionId();
                    } else {
                        sharewithsiblingsIconCompatParcelizer = (shareWithSiblings) sharewithsiblingsIconCompatParcelizer.write(from.getCollectionId());
                        sharewithsiblings = sharewithsiblingsIconCompatParcelizer;
                        collectionId = null;
                    }
                }
                if (structuredQuery.hasWhere()) {
                    fillVector fillvectorSerializer = RemoteSerializer.serializer(structuredQuery.getWhere());
                    if (!(fillvectorSerializer instanceof setShouldAttachOnInsert)) {
                        listSingletonList = Collections.singletonList(fillvectorSerializer);
                        break;
                    }
                    setShouldAttachOnInsert setshouldattachoninsert = (setShouldAttachOnInsert) fillvectorSerializer;
                    ArrayList arrayList4 = setshouldattachoninsert.read;
                    Iterator it8 = arrayList4.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            if (setshouldattachoninsert.IconCompatParcelizer()) {
                                listSingletonList = Collections.unmodifiableList(arrayList4);
                                break;
                            }
                        } else if (((fillVector) it8.next()) instanceof setShouldAttachOnInsert) {
                        }
                        listSingletonList = Collections.singletonList(fillvectorSerializer);
                        break;
                    }
                }
                listSingletonList = Collections.EMPTY_LIST;
                List list2 = listSingletonList;
                int orderByCount = structuredQuery.getOrderByCount();
                if (orderByCount > 0) {
                    ArrayList arrayList5 = new ArrayList(orderByCount);
                    for (int i2 = 0; i2 < orderByCount; i2++) {
                        StructuredQuery.Order orderBy = structuredQuery.getOrderBy(i2);
                        childHitTestqzLsGqo childhittestqzlsgqo = childHitTestqzLsGqo.read(orderBy.getField().getFieldPath());
                        int i3 = onRequestMeasuredefault.RatingCompat[orderBy.getDirection().ordinal()];
                        if (i3 == 1) {
                            accessgetoncommitaffectinglayercp = accessgetOnCommitAffectingLayercp.ASCENDING;
                        } else {
                            if (i3 != 2) {
                                getRectManager.write("Unrecognized direction %d", orderBy.getDirection());
                                throw null;
                            }
                            accessgetoncommitaffectinglayercp = accessgetOnCommitAffectingLayercp.DESCENDING;
                        }
                        arrayList5.add(new accessgetSnapshotObserver(accessgetoncommitaffectinglayercp, childhittestqzlsgqo));
                    }
                    setbefore = null;
                    list = arrayList5;
                } else {
                    setbefore = null;
                    list = Collections.EMPTY_LIST;
                }
                getsnapshotobserver = new getSnapshotObserver(new fromParentRect(sharewithsiblings, collectionId, list2, list, structuredQuery.hasLimit() ? structuredQuery.getLimit().getValue() : -1L, structuredQuery.hasStartAt() ? new setBefore(structuredQuery.getStartAt().getValuesList(), structuredQuery.getStartAt().getBefore()) : setbefore, structuredQuery.hasEndAt() ? new setBefore(structuredQuery.getEndAt().getValuesList(), !structuredQuery.getEndAt().getBefore()) : setbefore));
            }
        } else {
            com.google.firestore.v1.Target.DocumentsTarget documents = target.getDocuments();
            int documentsCount = documents.getDocumentsCount();
            getRectManager.RemoteActionCompatParcelizer(documentsCount == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(documentsCount));
            shareWithSiblings sharewithsiblings3 = RemoteSerializer.read(documents.getDocuments(0));
            getsnapshotobserver = new getSnapshotObserver(accessgetPointerInputSourcecp.IconCompatParcelizer(sharewithsiblings3.IconCompatParcelizer.size() == 4 ? shareWithSiblings.serializer : RemoteSerializer.IconCompatParcelizer(sharewithsiblings3)).serializer());
        }
        return new setLastShapeui(getsnapshotobserver, targetId, lastListenSequenceNumber, getWasLayerBlockInvokedui.LISTEN, snapshotVersionWrite, snapshotVersionWrite2, resumeToken, null);
    }
}
