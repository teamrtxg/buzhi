package com.wd.common.network;

import org.w3c.dom.DOMConfiguration;

import java.net.PortUnreachableException;

/**
 * @作者 GXY
 * @创建日期 2019/2/27 8:50
 * @描述 api接口类
 */
public class Apis {
    /**
     * @作者 GXY
     * @创建日期 2019/2/27 8:57
     * @描述 用户相关接口
     */
    /**
     * 1.注册
     * 接口地址：https://172.17.8.100/techApi/user/v1/register
     * 请求方式:POST
     * 接口描述:用户注册
     */
    public static final String URL_USER_REGISTER_POST = "user/v1/register";
    /**
     * 2.登陆
     * 接口地址：https://172.17.8.100/techApi/user/v1/login
     * 请求方式:POST
     * 接口描述:用户登录
     */
    public static final String URL_USER_LOGIN_POST = "user/v1/login";
    /**
     * 3.完善用户信息
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/perfectUserInfo
     * 请求方式:POST
     * 接口描述:完善用户信息
     */
    public static final String URL_USER_VERIFY_PERFECTUSERINFO_POST = "user/verify/v1/perfectUserInfo";
    /**
     * 4.根据用户ID查询用户信息
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/getUserInfoByUserId
     * 请求方式:GET
     * 接口描述:根据用户ID查询用户信息
     */
    public static final String URL_USER_VERIFY_GETUSERINFOBYUSERID_GET = "user/verify/v1/getUserInfoByUserId";
    /**
     * 5. 修改用户昵称
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/modifyNickName
     * 请求方式:PUT
     * 接口描述: 修改用户昵称
     */
    public static final String URL_USER_VERIFY_MODIFYNICKNAME_PUT = "user/verify/v1/modifyNickName";
    /**
     * 6.  修改用户签名
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/modifySignature
     * 请求方式:PUT
     * 接口描述:  修改用户签名
     */
    public static final String URL_USER_VERIFY_MODIFYSIGNATURE_PUT = "user/verify/v1/modifySignature";
    /**
     * 7. 用户上传头像
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/modifyHeadPic
     * 请求方式:POST
     * 接口描述: 用户上传头像
     */
    public static final String URL_USER_VERIFY_MODIFYHEADPIC_POST = "user/verify/v1/modifyHeadPic";
    /**
     * 8.  修改邮箱
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/modifyEmail
     * 请求方式:PUT
     * 接口描述:  修改邮箱
     */
    public static final String URL_USER_VERIFY_MODIFYEMAIL_PUT = "user/verify/v1/modifyEmail";
    /**
     * 9.  修改用户密码
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/modifyUserPwd
     * 请求方式:PUT
     * 接口描述:  修改用户密码
     */
    public static final String URL_USER_VERIFY_MODIFYUSERPWD_PUT = "user/verify/v1/modifyUserPwd";
    /**
     * 10.根据环信userNames批量查询会话列表需要的用户信息
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/findConversationList
     * 请求方式:GET
     * 接口描述:根据环信单个或者多个username查询用户信息
     */
    public static final String URL_USER_VERIFY_FINDCONVERSATIONLIST_GET = "user/verify/v1/findConversationList";
    /**
     * 11.查询用户积分
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/findUserIntegral
     * 请求方式:GET
     * 接口描述:查询用户积分
     */
    public static final String URL_USER_VERIFY__FINDUSERINTEGRAL_GET = "user/verify/v1/findUserIntegral";
    /**
     * 12.查询用户积分明细
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/findUserIntegralRecord
     * 请求方式:GET
     * 接口描述:查询用户积分明细
     */
    public static final String URL_USER_VERIFY_FINDUSERINTEGERALRECORD_GET = "user/verify/v1/findUserIntegralRecord";
    /**
     * 13.用户收藏列表
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/findAllInfoCollection
     * 请求方式:GET
     * 接口描述:用户收藏列表
     */
    public static final String URL_USER_VERIFY_FINDALLINFOCOLLECTION_GET = "user/verify/v1/findAllInfoCollection";
    /**
     * 14.添加收藏
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/addCollection
     * 请求方式:POST
     * 接口描述:添加收藏
     */
    public static final String URL_USER_VERIFY_Addcollection_post = "user/verify/v1/addCollection";
    /**
     * 15.取消收藏（支持批量操作）
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/cancelCollection
     * 请求方式:DELETE
     * 接口描述:取消收藏，支持批量操作
     */
    public static final String URL_USER_VERIFY_CANCELCOLLECTION_DELETE = "user/verify/v1/cancelCollection";
    /**
     * 16.用户关注列表
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/findFollowUserList
     * 请求方式:GET
     * 接口描述:查询用户积分明细
     */
    public static final String URL_USER_VERIFY_FINDFOLLOWUSERLIST_GET = "user/verify/v1/findFollowUserList";
    /**
     * 17.关注用户
     *接口地址：https://172.17.8.100/techApi/user/verify/v1/addFollow
     *请求方式:POST
     *接口描述:关注用户
     */
    public static final String URL_USER_VERIFY_ADDFOLLOW_POST = "user/verify/v1/addFollow";
    /**
     * 18.取消关注
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/cancelFollow
     * 请求方式:DELETE
     * 接口描述:取消关注
     * */
    public static final String URL_USER_VERIFY_CANCELFOLLOW_DELETE = "user/verify/v1/cancelFollow";
    /**
     * 19.校验手机号是否可用
     * 接口地址：https://172.17.8.100/techApi/user/v1/checkPhone
     * 请求方式:POST
     * 接口描述:在调用第三方mob的SDK前，要先调用下该接口来校验手机号是否可用
     * */
    public static final String URL_USER_VERIFY_CHECKPHONE_POST = "user/v1/checkPhone";
    /**
     * 20.微信登录
     * 接口地址：https://172.17.8.100/techApi/user/v1/weChatLogin
     * 请求方式:POST
     * 接口描述:微信登录 用户在登录页选择第三方登陆的方式，点击微信登陆，调用微信获取参数code的接口，
     * 获取到code之后，传给服务端即可。在获取code时需要传入参数appId,咱们的appId是wx4c96b6b8da494224
     * */
    public static final String URL_USER_VERIFY_WECHATLOGIN_POST = "user/v1/weChatLogin";
    /**
     * 21.绑定微信帐号
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/bindWeChat
     * 请求方式:POST
     * 接口描述:绑定微信帐号
     * */
    public static final String URL_USER_VERIFY_BINDWECHAT_POST = "user/verify/v1/bindWeChat";
    /**
     * 22.判断是否绑定微信
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/whetherToBindWeChat
     * 请求方式:GET
     * 接口描述:判断是否绑定微信
     * */
    public static final String URL_USER_VERIFY_WHETHERTOBINDWECHAT_GET = "user/verify/v1/whetherToBindWeChat";
    /**
     * 23.查询用户任务列表
     * 做任务
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/findUserTaskList
     * 请求方式:GET
     * 接口描述:查询用户任务列表
     * */
    public static final String URL_USER_VERIFY_FINDUSERTASKLIST_GET = "user/verify/v1/findUserTaskList";
    /**
     * 24.做任务
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/doTheTask
     * 请求方式:POST
     * 接口描述:做任务
     * */
    public static final String URL_USER_VERIFY_DOTHETASK_POST = "user/verify/v1/doTheTask";
    /**
     * 25.签到
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/userSign
     * 请求方式:POST
     * 接口描述:签到
     * */
    public static final String URL_USER_VERIFY_USERSIGN_POST = "user/verify/v1/userSign";
    /**
     * 26. 查询当天签到状态
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/findUserSignStatus
     * 请求方式:GET
     * 接口描述: 查询当天签到状态
     * */
    public static final String URL_USER_VERIFY_FINDUSERSIGNSTATUS_GET = "user/verify/v1/findUserSignStatus";
    /**
     * 27.查询用户连续签到天数
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/findContinuousSignDays
     * 请求方式:GET
     * 接口描述:查询用户连续签到天数
     * */
    public static final String URL_USER_VERIFY_FINDCONTINUOUSSIGNDAYS_GET = "user/verify/v1/findContinuousSignDays";
    /**
     * 28查询用户当月所有签到的日期
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/findUserSignRecording
     * 请求方式:GET
     * 接口描述:查询用户当月所有签到的日期，客户端做日历签到展示可以调用此接口
     * */
    public static final String URL_USER_VERIFY_FINDUSERSIGNRECORDING_GET = "user/verify/v1/findUserSignRecording";
    /**
     * 29.查询好友信息
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/queryFriendInformation
     * 请求方式:GET
     * 接口描述:查询好友信息
     * */
    public static final String URL_USER_VERIFY_QUERYFRIENDFORMATION_GET = "user/verify/v1/queryFriendInformation";
    /**
     * 30增量查询脸部特征库
     * 接口地址：https://172.17.8.100/techApi/user/v1/incrementFindFaceFeature
     * 请求方式:get
     * 接口描述: 增量查询脸部特征库
     * */
    public static final String URL_USER_VERIFY_INCREMENTFINDFACEFEATURE_GET = "user/v1/incrementFindFaceFeature";
    /**
     * 31. 绑定faceId
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/bindingFaceId
     * 请求方式:PUT
     * 接口描述: 绑定faceId，可以用来刷脸登录
     * */
    public static final String URL_USER_VERIFY_BINDINGFACEID_PUT = "user/verify/v1/bindingFaceId";
    /**
     * 32.刷脸登陆
     * 接口地址：https://172.17.8.100/techApi/user/v1/faceLogin
     * 请求方式:POST
     * 接口描述:刷脸登录
     * */
    public static final String URL_USER_VERIFY_FACELOGIN_POST = "user/v1/faceLogin";
    /**
     * 33.根据手机号查询用户信息
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/findUserByPhone
     *      * 请求方式:GET
     * 接口描述:根据手机号查询用户信息
     * */
    public static final String URL_USER_VERIFY_FINDUSERBYPHONE_GET = "user/verify/v1/findUserByPhone";
    /**
     * 34解绑faceId
     * 接口地址：https://172.17.8.100/techApi/user/verify/v1/untiedFaceId
     * 请求方式:DELETE
     * 接口描述:解除faceId绑定
     * */
    public static final String URL_USER_VERIFY_UNTIEDFACEID_DELETE= "user/verify/v1/untiedFaceId";


    /**
      * @作者 GXY
      * @创建日期 2019/2/27 10:29
      * @描述 好友聊天相关
      */
    /**
     * 1.添加好友
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/addFriend
     * 请求方式:POST
     * 接口描述:添加好友
     * */
    public static final String URL_CHAT_VERIFY_ADDFRIEND_POST = "chat/verify/v1/addFriend";
    /**
     * 2.删除好友
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/deleteFriendRelation
     * 请求方式:DELETE
     * 接口描述:删除好友
     * */
    public static final String URL_CHAT_VERIFY_DELETEFRIENDRELATION_DELETE = "chat/verify/v1/deleteFriendRelation";
    /**
     * 3.修改好友备注
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/modifyFriendRemark
     * 请求方式:PUT
     * 接口描述:修改好友备注
     * */
    public static final String URL_CHAT_VERIFY_MODIFYFRIENDREMARK_PUT = "chat/verify/v1/modifyFriendRemark";
    /**
     * 4.检测是否为我的好友
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/checkMyFriend
     * 请求方式:GET
     * 接口描述:检测是否为我的好友
     * */
    public static final String URL_CHAT_VERIFY_CHECKMYFRIEND_GET = "chat/verify/v1/checkMyFriend";
    /**
     * 5.创建自定义好友分组
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/addFriendGroup
     * 请求方式:POST
     * 接口描述:创建自定义好友分组
     * */
    public static final String URL_CHAT_VERIFY_ADDFRIENDGROUP_POST = "chat/verify/v1/addFriendGroup";
    /**
     * 6.查询用户所有分组
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/findFriendGroupList
     * 请求方式:GET
     * 接口描述:查询用户所有分组
     * */
    public static final String URL_CHAT_VERIFY_FINDFRIENDGROUPLIST_GET= "chat/verify/v1/findFriendGroupList";
    /**
     * 7.修改好友分组名称
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/modifyGroupName
     * 请求方式:PUT
     * 接口描述:修改好友分组名称
     * */
    public static final String URL_CHAT_VERIFY_MODIFYGROUPNAME_PUT= "chat/verify/v1/modifyGroupNamet";
    /**
     * 8.转移好友到其他分组
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/transferFriendGroup
     * 请求方式:PUT
     * 接口描述:转移好友到其他分组
     * */
    public static final String URL_CHAT_VERIFY_TRANSFERFRIENDGROUP_PUT= "chat/verify/v1/transferFriendGroup";
    /**
     * 9.删除用户好友分组
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/deleteFriendGroup
     * 请求方式:DELETE
     * 接口描述:删除用户好友分组
     * */
    public static final String URL_CHAT_VERIFY_DELETEFRIENDGROUP_DELETE= "chat/verify/v1/deleteFriendGroup";
    /**
     * 10.查询分组下的好友列表信息
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/findFriendListByGroupId
     * 请求方式:GET
     * 接口描述:查询分组下的好友列表信息
     * */
    public static final String URL_CHAT_VERIFY_FINDFRIENDLISTBYGROUPID_GET= "chat/verify/v1/findFriendListByGroupId";
    /**
     * 11.查询用户的好友通知记录
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/findFriendNoticePageList
     * 请求方式:GET
     * 接口描述:查询用户的好友通知记录
     * */
    public static final String URL_CHAT_VERIFY_FINDFRIENDNOTICEPAGELIST_GET= "chat/verify/v1/findFriendNoticePageList";
    /**
     * 12.审核好友申请
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/reviewFriendApply
     * 请求方式:PUT
     * 接口描述:审核好友申请
     * */
    public static final String URL_CHAT_VERIFY_REVIEWFRIENDAPPLY_PUT= "chat/verify/v1/reviewFriendApply";
    /**
     * 13.发送消息
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/sendMessage
     * 请求方式:POST
     * 接口描述:发送消息，消息内容需要客户端用公钥进行加密处理
     * */
    public static final String URL_CHAT_VERIFY_SENDMESSAGE_POST= "chat/verify/v1/sendMessage";
    /**
     * 14.查询好友聊天记录
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/findChatRecordPageList
     * 请求方式:GET
     * 接口描述:查询好友聊天记录
     * */
    public static final String URL_CHAT_VERIFY_FINDCHATRECORDPAGELIST_GET= "chat/verify/v1/findChatRecordPageList";
    /**
     * 15.查询好友对话记录
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/findDialogueRecordPageList
     * 请求方式:GET
     * 接口描述:查询好友聊天记录
     * */
    public static final String URL_CHAT_VERIFY_FINDDIALOGUERECORDPAGERLIST_GET= "chat/verify/v1/findDialogueRecordPageList";
    /**
     * 16.删除好友聊天记录
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/deleteChatRecord
     * 请求方式:DELETE
     * 接口描述:删除好友聊天记录
     * */
    public static final String URL_CHAT_VERIFY_DELETECHATRECORD_DELETE= "chat/verify/v1/deleteChatRecord";
    /**
     * 17.查询我的好友列表
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/searchFriend
     * 请求方式:GET
     * 接口描述:联系人列表使用，根据用户昵称、备注名称搜索好友
     * */
    public static final String URL_CHAT_VERIFY_SEARCHFRIEND_GET= "chat/verify/v1/searchFriend";
    /**
     * 18初始化我的好友列表全量信息
     * 接口地址：https://172.17.8.100/techApi/chat/verify/v1/initFriendList
     * 请求方式:GET
     * 接口描述:初始化好友列表全量信息，包含我所有的好友分组和分组下的好友列表信息
     * */
    public static final String URL_CHAT_VERIFY_INITFRIENDLIST_GET= "chat/verify/v1/initFriendList";



    /**
      * @作者 GXY
      * @创建日期 2019/2/27 11:30
      * @描述 群组相关接口
      */
    /**
     * 1.创建群
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/createGroup
     * 请求方式:POST
     * 接口描述:创建群
     * */
    public static final String URL_GROUP_VERIFY_CREATEGROUP_POST = "group/verify/v1/createGroup";
    /**
     * 2.修改群组名
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/modifyGroupName
     * 请求方式:PUT
     * 接口描述:修改群组名
     * */
    public static final String URL_GROUP_VERIFY_MODIFYGROUPNAME_PUT = "group/verify/v1/modifyGroupName";
    /**
     * 3. 修改群简介
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/modifyGroupDescription
     * 请求方式:PUT
     * 接口描述: 修改群简介
     * */
    public static final String URL_GROUP_VERIFY_MODIFYGROUPDESCRIPTION_PUT = "group/verify/v1/modifyGroupDescription";
    /**
     * 4.解散群组
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/disbandGroup
     * 请求方式:DELETE
     * 接口描述:解散群组
     * */
    public static final String URL_GROUP_VERIFY_DISBANDGROUP_DELETE = "group/verify/v1/disbandGroup";
    /**
     * 5.查询我创建的群组
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/findGroupsByUserId
     * 请求方式:GET
     * 接口描述:查询我创建的群组
     * */
    public static final String URL_GROUP_VERIFY_FINDGROUPSBYUSERID_GET = "group/verify/v1/findGroupsByUserId";
    /**
     * 6.查询我所有加入的群组
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/findUserJoinedGroup
     * 请求方式:GET
     * 接口描述:查询我所有加入的群组
     * */
    public static final String URL_GROUP_VERIFY_FINDUSERJOINEDGROUP_GET = "group/verify/v1/findUserJoinedGroup";
    /**
     * 7. 查询群组内所有用户信息
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/findGroupMemberList
     * 请求方式:GET
     * 接口描述:查询群组内所有用户信息
     * */
    public static final String URL_GROUP_VERIFY_FINDGROUPMEMBERLIST_GET= "group/verify/v1/findGroupMemberList";
    /**
     * 8. 查询群组详细信息
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/findGroupInfo
     * 请求方式:GET
     * 接口描述:查询群组详细信息
     * */
    public static final String URL_GROUP_VERIFY_FINDGROUPINFO_GET = "group/verify/v1/findGroupInfo";
    /**
     * 9. 发送群信息
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/sendGroupMessage
     * 请求方式:POST
     * 接口描述:发送群信息，消息内容需要客户端用公钥进行加密处理
     * */
    public static final String URL_GROUP_VERIFY_SENDGROUPMESSAGE_POST= "group/verify/v1/sendGroupMessage";
    /**
     * 10.查询群聊天内容
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/findGroupChatRecordPage
     * 请求方式:GET
     * 接口描述:查询群聊天内容
     * */
    public static final String URL_GROUP_VERIFY_FINDGROUPCHATRECORDPAGER_GET = "group/verify/v1/findGroupChatRecordPage";
    /**
     * 11.移出群成员(管理员与群主才有的权限)
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/removeGroupMember
     * 请求方式:DELETE
     * 接口描述:移出群成员(管理员与群主才有的权限)
     * */
    public static final String URL_GROUP_VERIFY_REMOVEGROUPMEMBER_DELETE = "group/verify/v1/removeGroupMember";
    /**
     * 12.调整群成员角色(群主才有的权限)
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/modifyPermission
     * 请求方式:PUT
     * 接口描述:调整群成员角色(群主才有的权限)
     * */
    public static final String URL_GROUP_VERIFY_MODIFYPERMISSION_PUT = "group/verify/v1/modifyPermission";
    /**
     * 13.判断用户是否已在群内
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/whetherInGroup
     * 请求方式:GET
     * 接口描述:判断用户是否已在群内
     * */
    public static final String URL_GROUP_VERIFY_WHETHERINGROUP_GET = "group/verify/v1/whetherInGroup";
    /**
     * 14.申请进群
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/applyAddGroup
     * 请求方式:POST
     * 接口描述:申请进群
     * */
    public static final String URL_GROUP_VERIFY_APPLYADDGROUP_POST = "group/verify/v1/applyAddGroup";
    /**
     * 15. 邀请加群
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/inviteAddGroup
     * 请求方式:POST
     * 接口描述:邀请加群
     * */
    public static final String URL_GROUP_VERIFY_INVITEADDGROUP_POST = "group/verify/v1/inviteAddGroup";
    /**
     * 16批量邀请加群
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/batchInviteAddGroup
     * 请求方式:POST
     * 接口描述:批量邀请加群
     * */
    public static final String URL_GROUP_VERIFY_BATCHINVITEADDGROUP_POST = "group/verify/v1/batchInviteAddGroup";
    /**
     * 17.查询群通知记录
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/findGroupNoticePageList
     * 请求方式:GET
     * 接口描述:查询群通知记录
     * */
    public static final String URL_GROUP_VERIFY_FINDGROUPNOTICEPAGELIST_GET = "group/verify/v1/findGroupNoticePageList";
    /**
     * 18. 审核群申请
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/reviewGroupApply
     * 请求方式:PUT
     * 接口描述:审核群申请
     * */
    public static final String URL_GROUP_VERIFY_REVIEWGROUPAPPLY_PUT = "group/verify/v1/reviewGroupApply";
    /**
     * 19.上传群头像
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/uploadGroupHeadPic
     * 请求方式:POST
     * 接口描述:上传群头像
     * */
    public static final String URL_GROUP_VERIFY_UPLOADGROUPHEADPIC_POST = "group/verify/v1/uploadGroupHeadPic";
    /**
     * 20.退群
     * 接口地址：https://172.17.8.100/techApi/group/verify/v1/retreat
     * 请求方式:DELETE
     * 接口描述:用户退出选择的群组
     * */
    public static final String URL_GROUP_VERIFY_RETREAT_DELETE = "group/verify/v1/retreat";


    /**
      * @作者 GXY
      * @创建日期 2019/2/27 13:37
      * @描述  资讯相关接口
      *
      */
    /**
     * 1.banner展示列表
     * 接口地址：https://172.17.8.100/techApi/information/v1/bannerShow
     * 请求方式:GET
     * 接口描述:banner展示列表
     * */
    public static final String URL_INFORMATION_BANNERSHOW_GET = "information/v1/bannerShow";
    /**
     * 2.资讯推荐展示列表(包含单独板块列表展示)
     * 接口地址：https://172.17.8.100/techApi/information/v1/infoRecommendList
     * 请求方式:GET
     * 接口描述:资讯推荐展示列表,与点击板块查询资讯共用一个接口，当是点击板块查询时，
     * 将板块id作为参数传入即可。资讯会随机产生广告，客户端需根据是否为广告标识，进行展示。
     * */
    public static final String URL_INFORMATION_INFORECOMMENDLIST_GET = "information/v1/infoRecommendList";
    /**
     * 3. 资讯详情展示
     * 接口地址：https://172.17.8.100/techApi/information/v1/findInformationDetails
     * 请求方式:GET
     * 接口描述: 资讯详情展示,客户端将资讯id传给服务端，服务端将根据所传id进行判断，
     * 将资讯详情所需参数返给客户端，如果为付费资讯，服务端将会根据客户端传的用户id进行判断，
     * 如果传了用户id并且购买了该资讯，将正常返给客户端所需参数。否则不返回资讯正文，
     * 只返回标题、缩略图、摘要、发布时间以及评论、点赞相关数目与费用。
     * 客户端需根据返参做出与ui图一致的效果。
     * */
    public static final String URL_INFORMATION_FINDINFOMATIONDETAILS_GET = "information/v1/findInformationDetails";
    /**
     * 4.所有板块查询
     * 接口地址：https://172.17.8.100/techApi/information/v1/findAllInfoPlate
     * 请求方式:GET
     * 接口描述:所有板块查询
     * */
    public static final String URL_INFORMATION_FINDALLINFOPLATE_GET = "information/v1/findAllInfoPlate";
    /**
     * 5.修改资讯分享数
     * 接口地址：https://172.17.8.100/techApi/information/v1/updateInfoShareNum
     * 请求方式:PUT
     * 接口描述:修改资讯分享数
     * */
    public static final String URL_INFORMATION_UPDATEINFOSHARENUM_PUT = "information/v1/updateInfoShareNum";
    /**
     * 6.资讯点赞
     * 接口地址：https://172.17.8.100/techApi/information/verify/v1/addGreatRecord
     * 请求方式:POST
     * 接口描述:资讯点赞
     * */
    public static final String URL_INFORMATION_VERIFY_ADDGREATRECORD_POST = "information/verify/v1/addGreatRecord";
    /**
     * 7. 取消点赞
     * 接口地址：https://172.17.8.100/techApi/information/verify/v1/cancelGreat
     * 请求方式:DELETE
     * 接口描述:取消点赞
     * */
    public static final String URL_INFORMATION_VERIFY_CANCELGREAT_DELETE= "information/verify/v1/cancelGreat";
    /**
     * 8. 资讯用户评论
     * 接口地址：https://172.17.8.100/techApi/information/verify/v1/addInfoComment
     * 请求方式:POST
     * 接口描述:资讯用户评论
     * */
    public static final String URL_INFORMATION_VERIFY_ADDINFOCOMMENT_POST= "information/verify/v1/addInfoComment";
    /**
     * 9. 查询资讯评论列表
     * 接口地址：https://172.17.8.100/techApi/information/v1/findAllInfoCommentList
     * 请求方式:GET
     * 接口描述:查询资讯评论列表
     * */
    public static final String URL_INFORMATION_FINDALLINFOCOMMENTLIST_GET= "information/v1/findAllInfoCommentList";
    /**
     * 10.根据标题模糊查询
     * 接口地址：https://172.17.8.100/techApi/information/v1/findInformationByTitle
     * 请求方式:GET
     * 接口描述:根据标题模糊查询
     * */
    public static final String URL_INFORMATION_FINDINFOMATIONBYTITLE_GET= "information/v1/findInformationByTitle";
    /**
     * 11.根据作者名模糊查询
     * 接口地址：https://172.17.8.100/techApi/information/v1/findInformationBySource
     * 请求方式:GET
     * 接口描述:根据作者名模糊查询
     * */
    public static final String URL_INFORMATION_FINDINFOMATIONBYSOURCE_GET= "information/v1/findInformationBySource";
    /**
     * 12.资讯广告
     * 接口地址：https://172.17.8.100/techApi/information/v1/findInfoAdvertising
     * 请求方式:GET
     * 接口描述:资讯广告
     * */
    public static final String URL_INFORMATION_FINDINFOADVERTISING_GET= "information/v1/findInfoAdvertising";
    /**
     * 13.资讯积分兑换
     * 接口地址：https://172.17.8.100/techApi/information/verify/v1/infoPayByIntegral
     * 请求方式:post
     * 接口描述:资讯积分兑换接口
     * */
    public static final String URL_INFORMATION_VERIFY_INFOPAYBYINTEGRAL_POST= "information/verify/v1/infoPayByIntegral";


    /**
      * @作者 GXY
      * @创建日期 2019/2/27 13:58
      * @描述 社区相关接口
      *
      */

    /**
     * 1.社区列表
     * 接口地址：https://172.17.8.100/techApi/community/v1/findCommunityList
     * 请求方式:GET
     * 接口描述:社区列表查询
     * */
    public static final String URL_COMMUNITY_FINDCOMMUNITYLIST_GET = "community/v1/findCommunityList";
    /**
     * 2.发布帖子
     * 接口地址：https://172.17.8.100/techApi/community/verify/v1/releasePost
     * 请求方式:POST
     * 接口描述:发布帖子
     * */
    public static final String URL_COMMUNITY_VERIFY_RELEASEPOST_POST = "community/verify/v1/releasePost";
    /**
     * 3. 删除帖子(支持批量删除)
     * 接口地址：https://172.17.8.100/techApi/community/verify/v1/deletePost
     * 请求方式:DELETE
     * 接口描述: 删除帖子
     * */
    public static final String URL_COMMUNITY_VERIFY_DELETEPOST_DELETE = "community/verify/v1/deletePost";
    /**
     * 4.点赞
     * 接口地址：https://172.17.8.100/techApi/community/verify/v1/addCommunityGreat
     * 请求方式:POST
     * 接口描述:用户点赞
     * */
    public static final String URL_COMMUNITY_VERIFY_ADDCOMMUNITYGREAT_POST = "community/verify/v1/addCommunityGreat";
    /**
     * 5.取消点赞
     * 接口地址：https://172.17.8.100/techApi/community/verify/v1/cancelCommunityGreat
     * 请求方式:DELETE
     * 接口描述:取消点赞
     * */
    public static final String URL_COMMUNITY_VERIFY_CANCELCOMMUNITYGREAT_DELETE = "community/verify/v1/cancelCommunityGreat";
    /**
     *6.社区评论列表（标签方式返参）
     * 接口地址：https://172.17.8.100/techApi/community/v1/findCommunityCommentList
     * 请求方式:GET
     * 接口描述:社区评论列表
     * */
    public static final String URL_COMMUNITY_FINDCOMMUNITYCOMMENTLIST_GET = "community/v1/findCommunityCommentList";
    /**
     * 7.社区用户评论列表（bean方式返参）
     * 接口地址：https://172.17.8.100/techApi/community/v1/findCommunityUserCommentList
     * 请求方式:GET
     * 接口描述:社区评论列表，与6不同的是，此接口用于评论列表页
     * */
    public static final String URL_COMMUNITY_FINDCOMMUNITYUSERCOMMENTLIST_GET = "community/v1/findCommunityUserCommentList";
    /**
     * 8.社区评论
     * 接口地址：https://172.17.8.100/techApi/community/verify/v1/addCommunityComment
     * 请求方式:POST
     * 接口描述:社区评论
     * */
    public static final String URL_COMMUNITY_VERIFY_ADDCOMMUNITYCOMMENT_POST = "community/verify/v1/addCommunityComment";
    /**
     * 9. 我的帖子
     * 接口地址：https://172.17.8.100/techApi/community/verify/v1/findMyPostById
     * 请求方式:GET
     * 接口描述:我的帖子
     * */
    public static final String URL_COMMUNITY_VERIFY_FINDMYPOSTBYID_GET = "community/verify/v1/findMyPostById";
    /**
     * 10. 查询用户发布的帖子
     * 接口地址：https://172.17.8.100/techApi/community/verify/v1/findUserPostById
     * 请求方式:GET
     * 接口描述:查询用户发布的帖子
     * */
    public static final String URL_COMMUNITY_VERIFY_FINDUSERPOSTBYID_GET = "community/verify/v1/findUserPostById";


    /**
      * @作者 GXY
      * @创建日期 2019/2/27 14:21
      * @描述  综合业务相关接口
      *
      */
    /**
     * 1.查询所有会员商品
     * 接口地址：https://172.17.8.100/techApi/tool/v1/findVipCommodityList
     * 请求方式:GET
     * 接口描述:查询所有会员商品
     * */
    public static final String URL_TOOL_FINDVIPCOMMODITYLIST_GET = "tool/v1/findVipCommodityList";
    /**
     * 2.用户购买VIP
     * 接口地址：https://172.17.8.100/techApi/tool/verify/v1/buyVip
     * 请求方式:POST
     * 接口描述:用户购买VIP
     * */
    public static final String URL_TOOL_VERIFY_BUYVIP_POST = "tool/verify/v1/buyVip";
    /**
     * 3.支付
     * 接口地址：https://172.17.8.100/techApi/tool/verify/v1/pay
     * 请求方式:POST
     * 接口描述:支付
     * */
    public static final String URL_TOOL_VERIFY_PAY_POST = "tool/verify/v1/pay";
    /**
     * 4.微信分享前置接口，获取分享所需参数
     * 接口地址：https://172.17.8.100/techApi/tool/v1/wxShare
     * 请求方式:POST
     * 接口描述:微信分享前置接口，获取分享所需参数，签名生成规则：
     * time+"wxShare"+"tech"拼接成字符串，然后对这个字符串进行md5加密处理得出sign参数
     * */
    public static final String URL_TOOL_WXSHARE_POST = "tool/v1/wxShare";
    /**
     * 5.意见反馈
     * 接口地址：https://172.17.8.100/techApi/tool/verify/v1/recordFeedBack
     * 请求方式:POST
     * 接口描述:意见反馈
     * */
    public static final String URL_TOOL_VERIFY_RECORDFEEDBACK_POST = "tool/verify/v1/recordFeedBack";
    /**
     * 6.查询新版本
     * 接口地址：https://172.17.8.100/techApi/tool/v1/findNewVersion
     * 请求方式:GET
     * 接口描述:查询新版本
     * */
    public static final String URL_TOOL_FINDNEWVERSION_GET = "tool/v1/findNewVersion";
    /**
     * 7.查询所有奖品
     * 接口地址：https://172.17.8.100/techApi/tool/verify/v1/findAllPrize
     * 请求方式:GET
     * 接口描述:查询所有奖品
     * */
    public static final String URL_TOOL_VERIFY_FINDALLPRIZE_GET = "tool/verify/v1/findAllPrize";
    /**
     * 8.抽奖
     * 接口地址：https://172.17.8.100/techApi/tool/verify/v1/lottery
     * 请求方式:POST
     * 接口描述:抽奖
     * */
    public static final String URL_TOOL_VERIFY_LOTTERY_POST = "tool/verify/v1/lottery";
    /**
     * 9.查询用户抽奖记录
     * 接口地址：https://172.17.8.100/techApi/tool/verify/v1/findLotteryRecordList
     * 请求方式:GET
     * 接口描述:查询用户抽奖记录
     * */
    public static final String URL_TOOL_VERIFY_FINDLOTTERYRECORDLIST_GET = "tool/verify/v1/findLotteryRecordList";
    /**
     * 10.领取奖品
     * 接口地址：https://172.17.8.100/techApi/tool/verify/v1/receivePrize
     * 请求方式:PUT
     * 接口描述:领取奖品
     * */
    public static final String URL_TOOL_VERIFY_RECEIVEPRIZE_PUT = "tool/verify/v1/receivePrize";
    /**
     * 11.查询用户系统通知
     * 接口地址：https://172.17.8.100/techApi/tool/verify/v1/findSysNoticeList
     * 请求方式:GET
     * 接口描述:查询用户系统通知
     * */
    public static final String URL_TOOL_VERIFY_FINDSYSNOTICELIST_GET = "tool/verify/v1/findSysNoticeList";
}
