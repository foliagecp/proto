// Copyright 2022 Listware

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.7.1
// source: pbcmdb/service.proto

package pbcmdb

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

var File_pbcmdb_service_proto protoreflect.FileDescriptor

var file_pbcmdb_service_proto_rawDesc = []byte{
	0x0a, 0x14, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x17, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74,
	0x77, 0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x1a,
	0x13, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2f, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x32, 0xa3, 0x03, 0x0a, 0x0d, 0x56, 0x65, 0x72, 0x74, 0x65, 0x78, 0x53,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x4f, 0x0a, 0x06, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65,
	0x12, 0x20, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72, 0x65, 0x2e,
	0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x21, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72,
	0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x4d, 0x0a, 0x04, 0x52, 0x65, 0x61, 0x64, 0x12,
	0x20, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72, 0x65, 0x2e, 0x73,
	0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x21, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72, 0x65,
	0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x4f, 0x0a, 0x06, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x12, 0x20, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72, 0x65, 0x2e,
	0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x21, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72,
	0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x50, 0x0a, 0x07, 0x52, 0x65, 0x70, 0x6c, 0x61,
	0x63, 0x65, 0x12, 0x20, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72,
	0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x21, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77,
	0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x4f, 0x0a, 0x06, 0x52, 0x65, 0x6d,
	0x6f, 0x76, 0x65, 0x12, 0x20, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61,
	0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x21, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74,
	0x77, 0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x32, 0xa1, 0x03, 0x0a, 0x0b, 0x45,
	0x64, 0x67, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x4f, 0x0a, 0x06, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x12, 0x20, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77,
	0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x21, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73,
	0x74, 0x77, 0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62,
	0x2e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x4d, 0x0a, 0x04, 0x52,
	0x65, 0x61, 0x64, 0x12, 0x20, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61,
	0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x21, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74,
	0x77, 0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x4f, 0x0a, 0x06, 0x55, 0x70,
	0x64, 0x61, 0x74, 0x65, 0x12, 0x20, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77,
	0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x21, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73,
	0x74, 0x77, 0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62,
	0x2e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x50, 0x0a, 0x07, 0x52,
	0x65, 0x70, 0x6c, 0x61, 0x63, 0x65, 0x12, 0x20, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73,
	0x74, 0x77, 0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62,
	0x2e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x21, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c,
	0x69, 0x73, 0x74, 0x77, 0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d,
	0x64, 0x62, 0x2e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x4f, 0x0a,
	0x06, 0x52, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x12, 0x20, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69,
	0x73, 0x74, 0x77, 0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64,
	0x62, 0x2e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x21, 0x2e, 0x6f, 0x72, 0x67, 0x2e,
	0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63,
	0x6d, 0x64, 0x62, 0x2e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x42, 0x4c,
	0x0a, 0x17, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72, 0x65, 0x2e, 0x73,
	0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x42, 0x07, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x5a, 0x28, 0x67, 0x69, 0x74, 0x2e, 0x66, 0x67, 0x2d, 0x74, 0x65, 0x63, 0x68, 0x2e,
	0x72, 0x75, 0x2f, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x73, 0x64, 0x6b, 0x2f, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var file_pbcmdb_service_proto_goTypes = []interface{}{
	(*Request)(nil),  // 0: org.listware.sdk.pbcmdb.Request
	(*Response)(nil), // 1: org.listware.sdk.pbcmdb.Response
}
var file_pbcmdb_service_proto_depIdxs = []int32{
	0,  // 0: org.listware.sdk.pbcmdb.VertexService.Create:input_type -> org.listware.sdk.pbcmdb.Request
	0,  // 1: org.listware.sdk.pbcmdb.VertexService.Read:input_type -> org.listware.sdk.pbcmdb.Request
	0,  // 2: org.listware.sdk.pbcmdb.VertexService.Update:input_type -> org.listware.sdk.pbcmdb.Request
	0,  // 3: org.listware.sdk.pbcmdb.VertexService.Replace:input_type -> org.listware.sdk.pbcmdb.Request
	0,  // 4: org.listware.sdk.pbcmdb.VertexService.Remove:input_type -> org.listware.sdk.pbcmdb.Request
	0,  // 5: org.listware.sdk.pbcmdb.EdgeService.Create:input_type -> org.listware.sdk.pbcmdb.Request
	0,  // 6: org.listware.sdk.pbcmdb.EdgeService.Read:input_type -> org.listware.sdk.pbcmdb.Request
	0,  // 7: org.listware.sdk.pbcmdb.EdgeService.Update:input_type -> org.listware.sdk.pbcmdb.Request
	0,  // 8: org.listware.sdk.pbcmdb.EdgeService.Replace:input_type -> org.listware.sdk.pbcmdb.Request
	0,  // 9: org.listware.sdk.pbcmdb.EdgeService.Remove:input_type -> org.listware.sdk.pbcmdb.Request
	1,  // 10: org.listware.sdk.pbcmdb.VertexService.Create:output_type -> org.listware.sdk.pbcmdb.Response
	1,  // 11: org.listware.sdk.pbcmdb.VertexService.Read:output_type -> org.listware.sdk.pbcmdb.Response
	1,  // 12: org.listware.sdk.pbcmdb.VertexService.Update:output_type -> org.listware.sdk.pbcmdb.Response
	1,  // 13: org.listware.sdk.pbcmdb.VertexService.Replace:output_type -> org.listware.sdk.pbcmdb.Response
	1,  // 14: org.listware.sdk.pbcmdb.VertexService.Remove:output_type -> org.listware.sdk.pbcmdb.Response
	1,  // 15: org.listware.sdk.pbcmdb.EdgeService.Create:output_type -> org.listware.sdk.pbcmdb.Response
	1,  // 16: org.listware.sdk.pbcmdb.EdgeService.Read:output_type -> org.listware.sdk.pbcmdb.Response
	1,  // 17: org.listware.sdk.pbcmdb.EdgeService.Update:output_type -> org.listware.sdk.pbcmdb.Response
	1,  // 18: org.listware.sdk.pbcmdb.EdgeService.Replace:output_type -> org.listware.sdk.pbcmdb.Response
	1,  // 19: org.listware.sdk.pbcmdb.EdgeService.Remove:output_type -> org.listware.sdk.pbcmdb.Response
	10, // [10:20] is the sub-list for method output_type
	0,  // [0:10] is the sub-list for method input_type
	0,  // [0:0] is the sub-list for extension type_name
	0,  // [0:0] is the sub-list for extension extendee
	0,  // [0:0] is the sub-list for field type_name
}

func init() { file_pbcmdb_service_proto_init() }
func file_pbcmdb_service_proto_init() {
	if File_pbcmdb_service_proto != nil {
		return
	}
	file_pbcmdb_pbcmdb_proto_init()
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_pbcmdb_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   2,
		},
		GoTypes:           file_pbcmdb_service_proto_goTypes,
		DependencyIndexes: file_pbcmdb_service_proto_depIdxs,
	}.Build()
	File_pbcmdb_service_proto = out.File
	file_pbcmdb_service_proto_rawDesc = nil
	file_pbcmdb_service_proto_goTypes = nil
	file_pbcmdb_service_proto_depIdxs = nil
}
