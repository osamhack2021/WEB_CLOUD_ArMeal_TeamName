import { login as loginAPI } from "api";
import { createPromiseThunk, reducerUtils, handleAsyncActions } from 'utils/asyncUtils';

const LOGIN = "LOGIN";
const LOGIN_SUCCESS = "LOGIN_SUCCESS";
const LOGIN_ERROR = "LOGIN_ERROR";

export const login = createPromiseThunk(LOGIN, loginAPI);

const initialState = {
  auth: reducerUtils.initial()
}

export default function authReducer(state = initialState, action){
  switch(action.type){
    case LOGIN:
    case LOGIN_SUCCESS:
    case LOGIN_ERROR:
      return handleAsyncActions(LOGIN, 'auth')(state, action);
    default:
      return state;
  }
}