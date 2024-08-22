package du;

import org.apache.ibatis.annotations.Select;

import du.db.MemberDto;

public interface MemberMapper {
	@Select("select count(*) from member where email=#{email} and password=#{password}")
	public int isMember(MemberDto memberDto);
	@Select("select * from member where email=#{email} and password=#{password}")
	public MemberDto findMember(MemberDto memberDto);

}
