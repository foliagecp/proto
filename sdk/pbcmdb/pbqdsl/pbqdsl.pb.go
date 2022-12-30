// Copyright 2022 Listware

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.7.1
// source: pbcmdb/pbqdsl/pbqdsl.proto

package pbqdsl

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type Options struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id     bool `protobuf:"varint,1,opt,name=id,proto3" json:"id,omitempty"`
	Key    bool `protobuf:"varint,2,opt,name=key,proto3" json:"key,omitempty"`
	Name   bool `protobuf:"varint,3,opt,name=name,proto3" json:"name,omitempty"`
	Type   bool `protobuf:"varint,4,opt,name=type,proto3" json:"type,omitempty"`
	Object bool `protobuf:"varint,5,opt,name=object,proto3" json:"object,omitempty"`
	Link   bool `protobuf:"varint,6,opt,name=link,proto3" json:"link,omitempty"`
	LinkId bool `protobuf:"varint,7,opt,name=linkId,proto3" json:"linkId,omitempty"`
	Path   bool `protobuf:"varint,8,opt,name=path,proto3" json:"path,omitempty"`
	Remove bool `protobuf:"varint,9,opt,name=remove,proto3" json:"remove,omitempty"`
}

func (x *Options) Reset() {
	*x = Options{}
	if protoimpl.UnsafeEnabled {
		mi := &file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Options) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Options) ProtoMessage() {}

func (x *Options) ProtoReflect() protoreflect.Message {
	mi := &file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Options.ProtoReflect.Descriptor instead.
func (*Options) Descriptor() ([]byte, []int) {
	return file_pbcmdb_pbqdsl_pbqdsl_proto_rawDescGZIP(), []int{0}
}

func (x *Options) GetId() bool {
	if x != nil {
		return x.Id
	}
	return false
}

func (x *Options) GetKey() bool {
	if x != nil {
		return x.Key
	}
	return false
}

func (x *Options) GetName() bool {
	if x != nil {
		return x.Name
	}
	return false
}

func (x *Options) GetType() bool {
	if x != nil {
		return x.Type
	}
	return false
}

func (x *Options) GetObject() bool {
	if x != nil {
		return x.Object
	}
	return false
}

func (x *Options) GetLink() bool {
	if x != nil {
		return x.Link
	}
	return false
}

func (x *Options) GetLinkId() bool {
	if x != nil {
		return x.LinkId
	}
	return false
}

func (x *Options) GetPath() bool {
	if x != nil {
		return x.Path
	}
	return false
}

func (x *Options) GetRemove() bool {
	if x != nil {
		return x.Remove
	}
	return false
}

type Query struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Query   string   `protobuf:"bytes,1,opt,name=query,proto3" json:"query,omitempty"`
	Options *Options `protobuf:"bytes,2,opt,name=options,proto3" json:"options,omitempty"`
}

func (x *Query) Reset() {
	*x = Query{}
	if protoimpl.UnsafeEnabled {
		mi := &file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Query) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Query) ProtoMessage() {}

func (x *Query) ProtoReflect() protoreflect.Message {
	mi := &file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Query.ProtoReflect.Descriptor instead.
func (*Query) Descriptor() ([]byte, []int) {
	return file_pbcmdb_pbqdsl_pbqdsl_proto_rawDescGZIP(), []int{1}
}

func (x *Query) GetQuery() string {
	if x != nil {
		return x.Query
	}
	return ""
}

func (x *Query) GetOptions() *Options {
	if x != nil {
		return x.Options
	}
	return nil
}

type Element struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id     string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Key    string `protobuf:"bytes,2,opt,name=key,proto3" json:"key,omitempty"`
	Name   string `protobuf:"bytes,3,opt,name=name,proto3" json:"name,omitempty"`
	Type   string `protobuf:"bytes,4,opt,name=type,proto3" json:"type,omitempty"`
	Object []byte `protobuf:"bytes,5,opt,name=object,proto3" json:"object,omitempty"`
	LinkId string `protobuf:"bytes,6,opt,name=linkId,proto3" json:"linkId,omitempty"`
	Link   []byte `protobuf:"bytes,7,opt,name=link,proto3" json:"link,omitempty"`
	Path   []byte `protobuf:"bytes,8,opt,name=path,proto3" json:"path,omitempty"`
}

func (x *Element) Reset() {
	*x = Element{}
	if protoimpl.UnsafeEnabled {
		mi := &file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Element) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Element) ProtoMessage() {}

func (x *Element) ProtoReflect() protoreflect.Message {
	mi := &file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Element.ProtoReflect.Descriptor instead.
func (*Element) Descriptor() ([]byte, []int) {
	return file_pbcmdb_pbqdsl_pbqdsl_proto_rawDescGZIP(), []int{2}
}

func (x *Element) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Element) GetKey() string {
	if x != nil {
		return x.Key
	}
	return ""
}

func (x *Element) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Element) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (x *Element) GetObject() []byte {
	if x != nil {
		return x.Object
	}
	return nil
}

func (x *Element) GetLinkId() string {
	if x != nil {
		return x.LinkId
	}
	return ""
}

func (x *Element) GetLink() []byte {
	if x != nil {
		return x.Link
	}
	return nil
}

func (x *Element) GetPath() []byte {
	if x != nil {
		return x.Path
	}
	return nil
}

type Elements struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Elements []*Element `protobuf:"bytes,1,rep,name=Elements,proto3" json:"Elements,omitempty"`
}

func (x *Elements) Reset() {
	*x = Elements{}
	if protoimpl.UnsafeEnabled {
		mi := &file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Elements) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Elements) ProtoMessage() {}

func (x *Elements) ProtoReflect() protoreflect.Message {
	mi := &file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Elements.ProtoReflect.Descriptor instead.
func (*Elements) Descriptor() ([]byte, []int) {
	return file_pbcmdb_pbqdsl_pbqdsl_proto_rawDescGZIP(), []int{3}
}

func (x *Elements) GetElements() []*Element {
	if x != nil {
		return x.Elements
	}
	return nil
}

var File_pbcmdb_pbqdsl_pbqdsl_proto protoreflect.FileDescriptor

var file_pbcmdb_pbqdsl_pbqdsl_proto_rawDesc = []byte{
	0x0a, 0x1a, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2f, 0x70, 0x62, 0x71, 0x64, 0x73, 0x6c, 0x2f,
	0x70, 0x62, 0x71, 0x64, 0x73, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1e, 0x6f, 0x72,
	0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70,
	0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x70, 0x62, 0x71, 0x64, 0x73, 0x6c, 0x22, 0xc3, 0x01, 0x0a,
	0x07, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x08, 0x52, 0x02, 0x69, 0x64, 0x12, 0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x08, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12,
	0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x08, 0x52, 0x04, 0x74, 0x79,
	0x70, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x6f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x18, 0x05, 0x20, 0x01,
	0x28, 0x08, 0x52, 0x06, 0x6f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6c, 0x69,
	0x6e, 0x6b, 0x18, 0x06, 0x20, 0x01, 0x28, 0x08, 0x52, 0x04, 0x6c, 0x69, 0x6e, 0x6b, 0x12, 0x16,
	0x0a, 0x06, 0x6c, 0x69, 0x6e, 0x6b, 0x49, 0x64, 0x18, 0x07, 0x20, 0x01, 0x28, 0x08, 0x52, 0x06,
	0x6c, 0x69, 0x6e, 0x6b, 0x49, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x70, 0x61, 0x74, 0x68, 0x18, 0x08,
	0x20, 0x01, 0x28, 0x08, 0x52, 0x04, 0x70, 0x61, 0x74, 0x68, 0x12, 0x16, 0x0a, 0x06, 0x72, 0x65,
	0x6d, 0x6f, 0x76, 0x65, 0x18, 0x09, 0x20, 0x01, 0x28, 0x08, 0x52, 0x06, 0x72, 0x65, 0x6d, 0x6f,
	0x76, 0x65, 0x22, 0x60, 0x0a, 0x05, 0x51, 0x75, 0x65, 0x72, 0x79, 0x12, 0x14, 0x0a, 0x05, 0x71,
	0x75, 0x65, 0x72, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x71, 0x75, 0x65, 0x72,
	0x79, 0x12, 0x41, 0x0a, 0x07, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x27, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72,
	0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x70, 0x62, 0x71,
	0x64, 0x73, 0x6c, 0x2e, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x52, 0x07, 0x6f, 0x70, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x22, 0xab, 0x01, 0x0a, 0x07, 0x45, 0x6c, 0x65, 0x6d, 0x65, 0x6e, 0x74,
	0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64,
	0x12, 0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b,
	0x65, 0x79, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x6f, 0x62,
	0x6a, 0x65, 0x63, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x06, 0x6f, 0x62, 0x6a, 0x65,
	0x63, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x6c, 0x69, 0x6e, 0x6b, 0x49, 0x64, 0x18, 0x06, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x06, 0x6c, 0x69, 0x6e, 0x6b, 0x49, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x6c, 0x69,
	0x6e, 0x6b, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x6c, 0x69, 0x6e, 0x6b, 0x12, 0x12,
	0x0a, 0x04, 0x70, 0x61, 0x74, 0x68, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x70, 0x61,
	0x74, 0x68, 0x22, 0x4f, 0x0a, 0x08, 0x45, 0x6c, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x73, 0x12, 0x43,
	0x0a, 0x08, 0x45, 0x6c, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b,
	0x32, 0x27, 0x2e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77, 0x61, 0x72, 0x65, 0x2e,
	0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x70, 0x62, 0x71, 0x64, 0x73,
	0x6c, 0x2e, 0x45, 0x6c, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x52, 0x08, 0x45, 0x6c, 0x65, 0x6d, 0x65,
	0x6e, 0x74, 0x73, 0x42, 0x58, 0x0a, 0x1e, 0x6f, 0x72, 0x67, 0x2e, 0x6c, 0x69, 0x73, 0x74, 0x77,
	0x61, 0x72, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2e, 0x70,
	0x62, 0x71, 0x64, 0x73, 0x6c, 0x42, 0x04, 0x51, 0x44, 0x53, 0x4c, 0x5a, 0x30, 0x67, 0x69, 0x74,
	0x2e, 0x66, 0x67, 0x2d, 0x74, 0x65, 0x63, 0x68, 0x2e, 0x72, 0x75, 0x2f, 0x66, 0x6c, 0x69, 0x73,
	0x74, 0x77, 0x61, 0x72, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x64, 0x6b, 0x2f,
	0x70, 0x62, 0x63, 0x6d, 0x64, 0x62, 0x2f, 0x70, 0x62, 0x71, 0x64, 0x73, 0x6c, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_pbcmdb_pbqdsl_pbqdsl_proto_rawDescOnce sync.Once
	file_pbcmdb_pbqdsl_pbqdsl_proto_rawDescData = file_pbcmdb_pbqdsl_pbqdsl_proto_rawDesc
)

func file_pbcmdb_pbqdsl_pbqdsl_proto_rawDescGZIP() []byte {
	file_pbcmdb_pbqdsl_pbqdsl_proto_rawDescOnce.Do(func() {
		file_pbcmdb_pbqdsl_pbqdsl_proto_rawDescData = protoimpl.X.CompressGZIP(file_pbcmdb_pbqdsl_pbqdsl_proto_rawDescData)
	})
	return file_pbcmdb_pbqdsl_pbqdsl_proto_rawDescData
}

var file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_pbcmdb_pbqdsl_pbqdsl_proto_goTypes = []interface{}{
	(*Options)(nil),  // 0: org.listware.sdk.pbcmdb.pbqdsl.Options
	(*Query)(nil),    // 1: org.listware.sdk.pbcmdb.pbqdsl.Query
	(*Element)(nil),  // 2: org.listware.sdk.pbcmdb.pbqdsl.Element
	(*Elements)(nil), // 3: org.listware.sdk.pbcmdb.pbqdsl.Elements
}
var file_pbcmdb_pbqdsl_pbqdsl_proto_depIdxs = []int32{
	0, // 0: org.listware.sdk.pbcmdb.pbqdsl.Query.options:type_name -> org.listware.sdk.pbcmdb.pbqdsl.Options
	2, // 1: org.listware.sdk.pbcmdb.pbqdsl.Elements.Elements:type_name -> org.listware.sdk.pbcmdb.pbqdsl.Element
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_pbcmdb_pbqdsl_pbqdsl_proto_init() }
func file_pbcmdb_pbqdsl_pbqdsl_proto_init() {
	if File_pbcmdb_pbqdsl_pbqdsl_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Options); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Query); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Element); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Elements); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_pbcmdb_pbqdsl_pbqdsl_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_pbcmdb_pbqdsl_pbqdsl_proto_goTypes,
		DependencyIndexes: file_pbcmdb_pbqdsl_pbqdsl_proto_depIdxs,
		MessageInfos:      file_pbcmdb_pbqdsl_pbqdsl_proto_msgTypes,
	}.Build()
	File_pbcmdb_pbqdsl_pbqdsl_proto = out.File
	file_pbcmdb_pbqdsl_pbqdsl_proto_rawDesc = nil
	file_pbcmdb_pbqdsl_pbqdsl_proto_goTypes = nil
	file_pbcmdb_pbqdsl_pbqdsl_proto_depIdxs = nil
}
