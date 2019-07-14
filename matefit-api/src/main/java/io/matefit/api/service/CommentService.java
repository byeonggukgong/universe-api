package io.matefit.api.service;

import io.matefit.api.response.DefaultRes;
import io.matefit.api.response.ResponseMessage;
import io.matefit.api.response.StatusCode;
import io.matefit.core.dto.CommentDto;
import io.matefit.core.dto.DoubleCommentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Service
@Transactional
public class CommentService {

    public DefaultRes createComment(@RequestBody CommentDto commentDto) {

        try{
            // dto -> entity

            return DefaultRes.res(StatusCode.OK, ResponseMessage.SUCCESS_TO_CREATE_COMMENT);
        } catch (Exception e){

            return DefaultRes.res(StatusCode.OK, ResponseMessage.FAIL_TO_CREATE_COMMENT);
        }
    }

    public DefaultRes deleteComment(@RequestBody CommentDto commentDto) {

        try{
            // dto -> entity

            return DefaultRes.res(StatusCode.OK, ResponseMessage.SUCCESS_TO_DELETE_COMMENT);
        } catch (Exception e){

            return DefaultRes.res(StatusCode.OK, ResponseMessage.FAIL_TO_DELETE_COMMENT);
        }
    }


    public DefaultRes createDoubleComment(@RequestBody DoubleCommentDto doubleCommentDto) {

        try{
            // dto -> entity

            return DefaultRes.res(StatusCode.OK, ResponseMessage.SUCCESS_TO_CREATE_DOUBLE_COMMENT);
        } catch (Exception e){

            return DefaultRes.res(StatusCode.OK, ResponseMessage.FAIL_TO_CREATE_DOUBLE_COMMENT);
        }
    }

    public DefaultRes deleteDoubleComment(@RequestBody DoubleCommentDto doubleCommentDto) {

        try{
            // dto -> entity

            return DefaultRes.res(StatusCode.OK, ResponseMessage.SUCCESS_TO_DELETE_DOUBLE_COMMENT);
        } catch (Exception e){

            return DefaultRes.res(StatusCode.OK, ResponseMessage.FAIL_TO_DELETE_DOUBLE_COMMENT);
        }
    }

}